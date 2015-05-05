/**
 * 
 */
package com.booksys.book.dao;

import java.util.List;

import com.booksys.po.Books;
import com.booksys.po.Booktypes;



/**
 * @author Administrator
 *
 */
public interface IBookDAO {
	
	/**
	 * 分页显示图书信息
	 * @param pages 当前页
	 * @param pagesize 每页显示行数
	 * @return Books集合
	 */
	public List<Books> getBooks(int pages,int pagesize);
	
	/**
	 * 获取总页数
	 * @param pagesize 每页显示行数
	 * @return 总页数
	 */
	public int getBookTotalPages(int pagesize);
	
	/***
	 * 根据图书编号显示图书信息
	 * @param bookid 图书编号
	 * @return 
	 */
	public Books getBookById(int bookid);
	
	/**
	 * 添加图书信息
	 * @param b
	 * @return 是否添加成功
	 */
	public boolean addBook(Books b);
	
	/**
	 * 修改图书信息
	 * @param b 图书基本信息
	 * @return 是否修改成功
	 */
	public boolean modifyBook(Books b);
	
	/**
	 * 删除图书
	 * @param bookid 图书编号
	 * @return 是否删除成功
	 */
	public boolean deleteBook(int bookid);
	
	/**
	 * 根据书名进行图书借阅情况查询
	 * @param bookname 书名
	 * @return Books集合
	 */
	public List<Books> getBooksByBookName(String bookname);
	
	/**
	 * 根据条码号进行图书借阅情况查询
	 * @param bookcode 条码号
	 * @return Books集合
	 */
	public List<Books> getBooksByBookCode(String bookcode);
	
	/**
	 * 根据ISBN进行图书借阅情况查询
	 * @param bookisbn ISBN
	 * @return Books集合
	 */
	public List<Books> getBooksByBookIsbn(String bookisbn);
	
	/**
	 * 添加图书类别信息
	 * @param bt 图书类别基本信息
	 * @return 是否添加成功
	 */
	public boolean addBooktype(Booktypes bt);
	
	/**
	 * 修改图书类别信息
	 * @param bt 图书类别基本信息
	 * @return 是否修改成功
	 */
	public boolean modifyBooktype(Booktypes bt);
	
	/**
	 * 删除图书类别
	 * @param booktypeid 图书类别编号
	 * @return 是否删除成功
	 */
	public boolean deleteBooktype(int booktypeid);
	
	/**
	 * 分页显示图书类别信息
	 * @param pages 当前页
	 * @param pagesize 每页显示行数
	 * @return Booktypes集合
	 */
	public List<Booktypes> getBooktypes(int pages,int pagesize);
	
	/**
	 * 获取总页数
	 * @param pagesize 每页显示行数
	 * @return 总页数
	 */
	public int getBooktypeTotalPages(int pagesize);
	
	/***
	 * 根据图书类别编号显示图书类别信息
	 * @param booktypeid 图书编号
	 * @return 
	 */
	public Booktypes getBooktypeById(int booktypeid);
	
	/**
	 * 图书查询
	 * @param b 图书类别编号
	 * @return Books集合
	 */
	public List<Books> getBooksByBooktypeid(Books b);
	
	/**
	 * 获取所有图书类别信息
	 * @return Booktypes集合
	 */
	public List<Booktypes> getBooktypes();
	
	/**
	 * 根据书名或条码号或ISBN查询
	 * @param b 书名/条码号/ISBN
	 * @return Books集合
	 */
	public List<Books> getBooksBybooknamebookcodebookisbn(Books b);
	
	/**
	 * 根据书名或ISBN或出版社或作者查询
	 * @param b 书名/ISBN/出版社/作者
	 * @return Books集合
	 */
	public List<Books> getBooksBybooknamebookisbnbookpublishbookauthor(Books b);
	
	/**
	 * 分页显示本类别的图书信息
	 * @param pages 当前页
	 * @param pagesize 每页显示行数
	 * @return Books集合
	 */
	public List<Books> getBooksbybooktypeid(int pages,int pagesize,int booktypeid);
	
	/**
	 * 获取本类别的图书总页数
	 * @param pagesize 每页显示行数
	 * @return 总页数
	 */
	public int getBookTotalPagesbybooktypeid(int pagesize,int booktypeid);
	
	/**
	 * 前台根据图书编号获取信息
	 * @param bookid
	 * @return 
	 */
	public Books getBookinfos(int bookid);
	
	/**
	 * 后台根据图书编号获取信息
	 * @param bookid
	 * @return 
	 */
	public Books getBookinfos1(int bookid);
	
	public Books getBooksByBookCodexdj(String bookcode);
}
