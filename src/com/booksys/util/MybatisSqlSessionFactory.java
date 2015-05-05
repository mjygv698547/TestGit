/**
 * 
 */
package com.booksys.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * ҵ���߼�Bean��������ȡSqlSessionʵ��
 * @author Administrator
 *
 */
public class MybatisSqlSessionFactory {

	private static SqlSessionFactory factory;
	private static String configfile = "mybatisconfig.xml";
	private static ThreadLocal<SqlSession> t1 = new ThreadLocal<SqlSession>();
	
	/**
	 * 
	 */
	protected MybatisSqlSessionFactory() {
		// TODO Auto-generated constructor stub
	}
	
	//��ȡSqlSessionFactoryʵ��
	private static SqlSessionFactory buildSqlSessionFactory(){
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream(configfile);
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(is != null){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return factory;
	}
	
	//���౻����ʱ���������һ��
	static{
		buildSqlSessionFactory();
	}
	
	protected static void rebuildSqlSessionFactory(){
		buildSqlSessionFactory();
	}
	
	/**
	 * ��ȡSqlSessionʵ��
	 * @return SqlSession
	 */
	public static SqlSession getSqlSession(){
		SqlSession session = t1.get();
		if(session == null){
			if(factory == null){
				rebuildSqlSessionFactory();
			}
			session = factory.openSession();
			t1.set(session);
		}
		return session;
	}
	
	/**
	 * Sqlsession��Դ�ͷ�
	 */
	public static void closeSqlSession(){
		SqlSession session = t1.get();
		if(session != null){
			session.close();
			t1.remove();
		}
	}
}


