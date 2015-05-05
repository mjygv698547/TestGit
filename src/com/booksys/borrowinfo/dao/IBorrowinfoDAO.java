/**
 * 
 */
package com.booksys.borrowinfo.dao;

import java.sql.Date;
import java.util.List;

import com.booksys.po.Books;
import com.booksys.po.Borrowinfos;
import com.booksys.po.Readers;
import com.booksys.po.Regulations;

/**
 * @author Administrator
 *
 */
public interface IBorrowinfoDAO {

	/***
	 * 根据图书id 和读者id 得到 读者和图书的信息
	 * @param bf包含图书id 和读者id 
	 * @return包含图书名和读者名字
	 */
	public Borrowinfos getreaderandbookinfo(Borrowinfos bf);
	
	/***
	 * 向借阅表中插入一组数据
	 * @param bf
	 * @return
	 */
	public boolean borrowbook(Borrowinfos bf);
	/***
	 * 修改书籍状态
	 * @param bf
	 * @return
	 */
	
	public boolean borrowbookupadtebook(Borrowinfos bf);
	
	/***
	 * 返回当前日期
	 * @return
	 */
	public Date getDate();
	
	/***
	 * 还书
	 * @return
	 */
	
	public boolean returnbook(int borrowinfosid);
	
	
	/***
	 * 得到准备归还的图书信息
	 * @param bf
	 * @return
	 */
	public Borrowinfos getreturnbookinfo(String bookcode);
	/***
	 * 根据书籍id返回预约者信息
	 * @param bookid
	 * @return
	 */
	public Borrowinfos getorderinfobybookid(int bookid);
	
	/***
	 * 根据书名得到书的信息
	 * @param bookname
	 * @return
	 */
	public Books getbookinfobybookname(String bookname);
	
	
	/***
	 * 修改书籍表
	 * @param bookid
	 * @return
	 */
	public boolean orderbookbybookid(int bookid);
	
	 /***
	  * 向借阅表中插入一条信息
	  * @param bf
	  * @return
	  */
	public boolean editborrowinfobybookidandreaderid(Borrowinfos bf);
	
	/***
	 * 通过bookcode得到bookid
	 * @param bookcode
	 * @return
	 */
	public int getbookidbybookcode(String bookcode);
	
	/***
	 * 得到借阅信息列表
	 * @param readerid
	 * @return
	 */
	public List<Borrowinfos>getorderbooklistbyreaderid(int readerid);
	
	
	/***
	 * 续借更新续借日期
	 * @param bf
	 * @return
	 */
	public boolean updatereborrowtimesandlastdate(Borrowinfos bf);
	
	/***
	 * 得到规则文件通过readerid
	 * @param readid
	 * @return
	 */
	public Regulations getRegulationsbyreadid(int readid);
	

	public int getTotalPages(int pagesize);

	public List<Borrowinfos> getBorrowinfos(int pages, int pagesize, int readerId);
	
	/***
	 * 
	 * @param readerId
	 * @return
	 */
	public List<Borrowinfos> getreaderstate(int readerId );
}
