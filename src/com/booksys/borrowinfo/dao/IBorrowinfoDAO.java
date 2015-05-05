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
	 * ����ͼ��id �Ͷ���id �õ� ���ߺ�ͼ�����Ϣ
	 * @param bf����ͼ��id �Ͷ���id 
	 * @return����ͼ�����Ͷ�������
	 */
	public Borrowinfos getreaderandbookinfo(Borrowinfos bf);
	
	/***
	 * ����ı��в���һ������
	 * @param bf
	 * @return
	 */
	public boolean borrowbook(Borrowinfos bf);
	/***
	 * �޸��鼮״̬
	 * @param bf
	 * @return
	 */
	
	public boolean borrowbookupadtebook(Borrowinfos bf);
	
	/***
	 * ���ص�ǰ����
	 * @return
	 */
	public Date getDate();
	
	/***
	 * ����
	 * @return
	 */
	
	public boolean returnbook(int borrowinfosid);
	
	
	/***
	 * �õ�׼���黹��ͼ����Ϣ
	 * @param bf
	 * @return
	 */
	public Borrowinfos getreturnbookinfo(String bookcode);
	/***
	 * �����鼮id����ԤԼ����Ϣ
	 * @param bookid
	 * @return
	 */
	public Borrowinfos getorderinfobybookid(int bookid);
	
	/***
	 * ���������õ������Ϣ
	 * @param bookname
	 * @return
	 */
	public Books getbookinfobybookname(String bookname);
	
	
	/***
	 * �޸��鼮��
	 * @param bookid
	 * @return
	 */
	public boolean orderbookbybookid(int bookid);
	
	 /***
	  * ����ı��в���һ����Ϣ
	  * @param bf
	  * @return
	  */
	public boolean editborrowinfobybookidandreaderid(Borrowinfos bf);
	
	/***
	 * ͨ��bookcode�õ�bookid
	 * @param bookcode
	 * @return
	 */
	public int getbookidbybookcode(String bookcode);
	
	/***
	 * �õ�������Ϣ�б�
	 * @param readerid
	 * @return
	 */
	public List<Borrowinfos>getorderbooklistbyreaderid(int readerid);
	
	
	/***
	 * ���������������
	 * @param bf
	 * @return
	 */
	public boolean updatereborrowtimesandlastdate(Borrowinfos bf);
	
	/***
	 * �õ������ļ�ͨ��readerid
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
