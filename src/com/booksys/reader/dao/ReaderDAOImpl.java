/**
 * 
 */
package com.booksys.reader.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.booksys.po.Readers;
import com.booksys.po.Regulations;
import com.booksys.util.MybatisSqlSessionFactory;


/**
 * @author Administrator
 *
 */
public class ReaderDAOImpl implements IReaderDAO {

	/**
	 * 
	 */
	public ReaderDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public Readers getregulationbyreaderid(Readers r) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Readers readers = session.selectOne("getregulationbyreaderid", r);
		MybatisSqlSessionFactory.closeSqlSession();
		return readers;
	}

	public Readers readerlogin(Readers r) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Readers reader = session.selectOne("readerlogin", r);
		MybatisSqlSessionFactory.closeSqlSession();
		return reader;
	}

	public Readers getreaderxdj(int readerid) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Readers reader = session.selectOne("getreaderxdj", readerid);
		MybatisSqlSessionFactory.closeSqlSession();
		return reader;
	}

	public boolean addreader(Readers r) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.insert("addreadersxdj", r);
		if(i>0){
			result=true;
			session.commit();
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public List<Readers> getreaderlist() {
		// TODO Auto-generated method stub
		List<Readers>readers = null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		readers = session.selectList("getreaderlist");
	    MybatisSqlSessionFactory.closeSqlSession();
		return readers;
	}

	public Readers getreaderbyreaderid(int readerid) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Readers reader = session.selectOne("getreaderbyreaderid", readerid);
	    MybatisSqlSessionFactory.closeSqlSession();
		return reader;
	}

	public boolean updatereaderdeaddate(Readers r) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		boolean result = false;
	    int i = session.update("updatereaderdeaddate", r);
	    if(i>0){
	    	 result = true;
	    	 session.commit();
	    }
	    MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public boolean deletereaderbyreaderid(int readerid) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.delete("deletereaderbyid", readerid);
		if(i > 0){
			result = true;
			session.commit();
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public boolean editReader(Readers r){
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		System.out.println(r.getReaderid()+"@@@"+r.getNewpassword()+r.getReaderpwd());
		int i = session.update("editreader",r);
		if (i > 0) {
			session.commit();
			result = true;
			System.out.println("修改成功");			
		} else {
			result = false;
			System.out.println("修改失败");			
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public int turnreaderidcardtoreaderid(String readeridcard) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int readerid = session.selectOne("turnreaderidcardtoreaderid",readeridcard);
		MybatisSqlSessionFactory.closeSqlSession();
		return readerid;
	}
	
	
//	public Date getdaterestborrowday(Readers r) {
//		// TODO Auto-generated method stub
//		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
//		Readers readers = session.selectOne("getregulationbyreaderid", r);
//		Date day = session.selectOne("getdaterestborrowday", readers);
//		
//		MybatisSqlSessionFactory.closeSqlSession();
//		return day;
//	}

}
