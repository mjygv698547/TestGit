package com.booksys.notice.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.booksys.po.Notices;
import com.booksys.util.MybatisSqlSessionFactory;

/**
 * @author Administrator
 *
 */
public class NoticeDAOImpl implements INoticeDAO {

	/**
	 * 
	 */
	public NoticeDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean addNotice(Notices n) {
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Integer noticeid = session.selectOne("getnoticeid");
		n.setNoticeid(noticeid);
		int i = session.insert("addnotice",n);
	
		if(i>0){
			result = true;
			session.commit();
		}else{
			result = false;
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}
	public boolean editNotice(Notices n) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		System.out.println(n.getNoticecontent()+n.getNoticeid());
		int i = session.update("editnotices", n);
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


	public List<Notices> getNotices(int pages, int pagesize) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Notices> list = session.selectList("getnotices", null, new RowBounds((pages-1)*pagesize,pagesize));//利用RowBounds实现分页操作
		MybatisSqlSessionFactory.closeSqlSession();
		return list;
	}

	public int getTotalPages(int pagesize) {
		// TODO Auto-generated method stub
		int totalpages = 0;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Integer totalrecords = session.selectOne("gettotalrecordscym");
		totalpages = (totalrecords%pagesize==0?0:1)+totalrecords/pagesize;
		MybatisSqlSessionFactory.closeSqlSession();
		return totalpages;
	}

	public Notices getNoticeById(int noticeid) {
		// TODO Auto-generated method stub
		Notices n= null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		 n = session.selectOne("getnoticebyid", noticeid);
		return n;
	}

	public boolean updateNotice(Notices n) {
		// TODO Auto-generated method stub
		String info = null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.update("updatenotice", n);
		if(i>0)
		{
			info="修改成功";
		}else{
			info="修改失败";
		}
		return false;
	}

	public int deleteNotice(int Noticeid) {
		// TODO Auto-generated method stub
		String info = null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.delete("deletenotice",Noticeid);
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
}