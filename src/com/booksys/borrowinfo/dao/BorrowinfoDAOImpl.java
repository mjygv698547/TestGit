/**
 * 
 */
package com.booksys.borrowinfo.dao;





import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.booksys.po.Books;
import com.booksys.po.Borrowinfos;
import com.booksys.po.Readers;
import com.booksys.po.Regulations;
import com.booksys.reader.dao.IReaderDAO;
import com.booksys.util.MybatisSqlSessionFactory;


/**
 * @author Administrator
 *
 */
public class BorrowinfoDAOImpl implements IBorrowinfoDAO {

	/**
	 * 
	 */
	private HttpServletRequest request;
	public BorrowinfoDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public Borrowinfos getreaderandbookinfo(Borrowinfos bf) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Borrowinfos bfs = session.selectOne("getreaderandbookinfo",bf);
		MybatisSqlSessionFactory.closeSqlSession();
		return bfs;
	}

	public boolean borrowbook(Borrowinfos bf) {
		// TODO Auto-generated method stub
		boolean result = false;
		
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.insert("borrowbook", bf);
		if(i>0){
			result = true;
			session.commit();
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public boolean borrowbookupadtebook(Borrowinfos bf) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
	  
		int i = session.update("borrowbookupadtebook", bf);
		if(i>0){
			result = true;
			session.commit();
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}
	public Date getDate(){
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
	    Date day = session.selectOne("getdate");
	    MybatisSqlSessionFactory.closeSqlSession();
	    return day;
	  
	}

	public boolean returnbook(int borrowinfosid) {
		// TODO Auto-generated method stub
		boolean result=false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.update("returnbook",borrowinfosid);
		if(i>0){
			result =true;
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public Borrowinfos getreturnbookinfo(String bookcode) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		
		Borrowinfos borrowinfos = session.selectOne("getreturnbookinfo", bookcode); 
		MybatisSqlSessionFactory.closeSqlSession();
		return borrowinfos;
	}

	public Borrowinfos getorderinfobybookid(int bookid) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Borrowinfos borrowinfos = session.selectOne("getorderinfobybookid", bookid); 
		MybatisSqlSessionFactory.closeSqlSession();
		return borrowinfos;
	}

	public Books getbookinfobybookname(String bookname) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Books books = session.selectOne("getbookinfobybookname",bookname);
		MybatisSqlSessionFactory.closeSqlSession();
		
		return books;
	}

	public boolean orderbookbybookid(int bookid) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.update("orderbookbybookid",bookid);
		if(i>0){
			result = true;
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public boolean editborrowinfobybookidandreaderid(Borrowinfos bf) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.insert("editborrowinfobybookidandreaderid", bf);
		if(i>0){
			result = true;
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public int getbookidbybookcode(String bookcode) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.selectOne("getbookidbybookcode",bookcode);
	    MybatisSqlSessionFactory.closeSqlSession();
		return i;
	}

	public List<Borrowinfos> getorderbooklistbyreaderid(int readerid) {
		// TODO Auto-generated method stub
		
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Borrowinfos>borrowinfos = session.selectList("getorderbooklistbyreaderid",readerid);
	    MybatisSqlSessionFactory.closeSqlSession();
		return borrowinfos;
	}

	public boolean updatereborrowtimesandlastdate(Borrowinfos bf) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		
		int i = session.update("updatereborrowtimesandlastdate",bf);
		if(i>0){
			result=true;
			session.commit();
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public Regulations getRegulationsbyreadid(int readid) {
		// TODO Auto-generated method stub
		
		
		return null;
	}
	public int getTotalPages(int pagesize) {
		// TODO Auto-generated method stub
		int totalpages = 0;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Integer totalrecords = session.selectOne("bgettotalrecords");
		totalpages = (totalrecords%pagesize==0?0:1)+totalrecords/pagesize;
		MybatisSqlSessionFactory.closeSqlSession();
		return totalpages;
	}

	public List<Borrowinfos> getBorrowinfos(int pages, int pagesize,int readerId) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		System.out.println("ttt"+pages+"ttt"+pagesize+"ttt"+readerId+"ttt");
		List<Borrowinfos> list = session.selectList("getborrowinfos", readerId, new RowBounds((pages-1)*pagesize,pagesize));//利用RowBounds实现分页操作
		System.out.println(list.size()+"yyy");
		MybatisSqlSessionFactory.closeSqlSession();
		return list;
	}

	public List<Borrowinfos> getreaderstate(int readerId) {
		// TODO Auto-generated method stub
		
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Borrowinfos> bf = session.selectList("getreaderstate",readerId);
		MybatisSqlSessionFactory.closeSqlSession();
		
		return bf;
	}

}
