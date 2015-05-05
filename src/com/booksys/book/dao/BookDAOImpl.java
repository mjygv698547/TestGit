/**
 * 
 */
package com.booksys.book.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.booksys.po.Books;
import com.booksys.po.Booktypes;
import com.booksys.util.MybatisSqlSessionFactory;

/**
 * @author Administrator
 *
 */
public class BookDAOImpl implements IBookDAO {

	/**
	 * 
	 */
	public BookDAOImpl() {
		// TODO Auto-generated constructor stub		
	}

	public List<Books> getBooks(int pages, int pagesize) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Books> list = session.selectList("getbooks", null, new RowBounds((pages-1)*pagesize,pagesize));
		MybatisSqlSessionFactory.closeSqlSession();
		return list;
	}

	public int getBookTotalPages(int pagesize) {
		// TODO Auto-generated method stub
		int totalpages = 0;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Integer totalrecords = session.selectOne("getbooktotalrecords");
		totalpages = (totalrecords%pagesize==0?0:1)+totalrecords/pagesize;
		MybatisSqlSessionFactory.closeSqlSession();
		return totalpages;
	}

	public Books getBookById(int bookid) {
		// TODO Auto-generated method stub
		Books b= null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		b = session.selectOne("getbookbyid", bookid);
		return b;
	}

	public boolean addBook(Books b) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		b.setBookstate(0);
		int i = session.insert("addbooks", b);
		if (i > 0) {
			session.commit();
			result = true;
			System.out.println("图书添加成功!");
		} else {
			result = false;
			System.out.println("图书添加失败!");
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}


	public boolean modifyBook(Books b) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.update("modifybooks", b);
		if (i > 0) {
			session.commit();
			result = true;
			System.out.println("图书修改成功!");			
		} else {
			result = false;
			System.out.println("图书修改失败!");	
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public boolean deleteBook(int bookid) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.delete("deletebooks", bookid);
		if (i > 0) {
			session.commit();
			result = true;
			System.out.println("图书删除成功!");			
		} else {
			result = false;
			System.out.println("图书删除失败!");	
		}
		return result;
	}

	public List<Books> getBooksByBookName(String bookname) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Books> list = session.selectList("getbookbyname", bookname);	
		MybatisSqlSessionFactory.closeSqlSession();	
		return list;
	}

	public List<Books> getBooksByBookCode(String bookcode) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Books> list = session.selectList("getbookbycode", bookcode);	
		MybatisSqlSessionFactory.closeSqlSession();	
		return list;
	}

	public List<Books> getBooksByBookIsbn(String bookisbn) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Books> list = session.selectList("getbookbyisbn", bookisbn);	
		MybatisSqlSessionFactory.closeSqlSession();	
		return list;
	}

	public boolean addBooktype(Booktypes bt) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.insert("addbooktypes", bt);
		if (i > 0) {
			session.commit();
			result = true;
			System.out.println("图书类别添加成功!");
		} else {
			result = false;
			System.out.println("图书类别添加失败!");
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public boolean modifyBooktype(Booktypes bt) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.update("modifybooktypes", bt);
		if (i > 0) {
			session.commit();
			result = true;
			System.out.println("图书类别修改成功!");			
		} else {
			result = false;
			System.out.println("图书类别修改失败!");	
		}
		MybatisSqlSessionFactory.closeSqlSession();
		return result;
	}

	public boolean deleteBooktype(int booktypeid) {
		// TODO Auto-generated method stub
		boolean result = false;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		int i = session.delete("deletebooktypes", booktypeid);
		if (i > 0) {
			session.commit();
			result = true;
			System.out.println("图书类别删除成功!");			
		} else {
			result = false;
			System.out.println("图书类别删除失败!");
		}
		return result;
	}

	public List<Booktypes> getBooktypes(int pages1, int pagesize1) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Booktypes> list = session.selectList("getbooktypes", null, new RowBounds((pages1-1)*pagesize1,pagesize1));
		MybatisSqlSessionFactory.closeSqlSession();
		return list;
	}

	public int getBooktypeTotalPages(int pagesize1) {
		// TODO Auto-generated method stub
		int totalpages1 = 0;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Integer totalrecords = session.selectOne("getbooktypetotalrecords");
		totalpages1 = (totalrecords%pagesize1==0?0:1)+totalrecords/pagesize1;
		MybatisSqlSessionFactory.closeSqlSession();
		return totalpages1;
	}

	public Booktypes getBooktypeById(int booktypeid) {
		// TODO Auto-generated method stub
		Booktypes bt= null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		bt = session.selectOne("getbooktypebyid", booktypeid);
		return bt;
	}

	public List<Books> getBooksByBooktypeid(Books b) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();	
		List<Books> list = session.selectList("getbookbybooktypeid", b);
		MybatisSqlSessionFactory.closeSqlSession();	
		return list;
	}

	public List<Booktypes> getBooktypes() {
		// TODO Auto-generated method stub				
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Booktypes> list = session.selectList("getbooktypes");
		MybatisSqlSessionFactory.closeSqlSession();
		return list;
	}

	public List<Books> getBooksBybooknamebookcodebookisbn(Books b) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();	
		List<Books> list = session.selectList("getbookbynamecodeisbn", b);
		MybatisSqlSessionFactory.closeSqlSession();	
		return list;
	}

	public List<Books> getBooksbybooktypeid(int pages2, int pagesize2 ,int booktypeid) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		List<Books> list = session.selectList("getbookbybooktypeid",booktypeid, new RowBounds((pages2-1)*pagesize2,pagesize2));
		MybatisSqlSessionFactory.closeSqlSession();
		return list;
	}

	public int getBookTotalPagesbybooktypeid(int pagesize2,int booktypeid) {
		// TODO Auto-generated method stub
		int totalpages = 0;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Integer totalrecords = session.selectOne("getbooktotalrecordsbybooktypeid",booktypeid);
		totalpages = (totalrecords%pagesize2==0?0:1)+totalrecords/pagesize2;
		MybatisSqlSessionFactory.closeSqlSession();
		return totalpages;
	}

	public Books getBookinfos(int bookid) {
		// TODO Auto-generated method stub
		Books b= null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		b = session.selectOne("getbookinfo", bookid);
		return b;
	}

	public Books getBookinfos1(int bookid) {
		// TODO Auto-generated method stub
		Books b= null;
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		b = session.selectOne("getbookinfos", bookid);
		return b;
	}

	public List<Books> getBooksBybooknamebookisbnbookpublishbookauthor(Books b) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();	
		List<Books> list = session.selectList("getbookbynameisbnpublishauthor", b);
		MybatisSqlSessionFactory.closeSqlSession();	
		return list;
	}
	
	public Books getBooksByBookCodexdj(String bookcode) {
		// TODO Auto-generated method stub
		SqlSession session = MybatisSqlSessionFactory.getSqlSession();
		Books list = session.selectOne("getbookbycode", bookcode);	
		MybatisSqlSessionFactory.closeSqlSession();	
		return list;
	}
}
