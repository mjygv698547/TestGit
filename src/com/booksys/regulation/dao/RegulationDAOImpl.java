/**
 * 
 */
package com.booksys.regulation.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.booksys.po.Notices;
import com.booksys.po.Regulations;
import com.booksys.util.MybatisSqlSessionFactory;

/**
 * @author Administrator
 *
 */
public class RegulationDAOImpl implements IRegulationDAO {

	/**
	 * 
	 */
	public RegulationDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public boolean addRegulation(Regulations r) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Integer Regulationid = session.selectOne("getregulationid");
		r.setRegulationid(Regulationid);
		int i = session.insert("addregulation",r);
	
		if(i>0){
			result = true;
			session.commit();
		}else{
			result = false;
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public List<Regulations> getRegulations(int pages, int pagesize) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Regulations> list = session.selectList("getregulations", null, new RowBounds((pages-1)*pagesize,pagesize));//利用RowBounds实现分页操作
		MybatisSqlSessionFactory.closeSqlSession();
		return list;
	}

	public int getTotalPages(int pagesize) {
		// TODO Auto-generated method stub
		int totalpages = 0;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Integer totalrecords = session.selectOne("rgettotalrecords");
		totalpages = (totalrecords%pagesize==0?0:1)+totalrecords/pagesize;
		MybatisSqlSessionFactory.closeSqlSession();
		return totalpages;
	}

	public Regulations getRegulationById(int Regulationid) {
		// TODO Auto-generated method stub
		Regulations r= null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		 r = session.selectOne("getregulationbyid", Regulationid);
		return r;
	}

	public boolean updateRegulation(Regulations r) {
		// TODO Auto-generated method stub
		String info = null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.update("editregulation",r);
		if(i>0)
		{
			info="修改成功";
		}else{
			info="修改失败";
		}
		return false;
	}

	public int deleteRegulation(int Regulationid) {
		// TODO Auto-generated method stub
		String info = null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		System.out.println(Regulationid);
		int i = session.delete("deleteregulation",Regulationid);
		if(i>0)
		{
			info="删除成功";
			session.commit();
		}else{
			info="删除失败";
			session.rollback();
		}
		System.out.println("delete: "+i);
		MybatisSqlSessionFactory.closeSqlSession();
		return i;
	}

	public boolean editRegulation(Regulations r) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.update("editregulation", r);
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

}
