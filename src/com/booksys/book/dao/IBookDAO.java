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
	 * ��ҳ��ʾͼ����Ϣ
	 * @param pages ��ǰҳ
	 * @param pagesize ÿҳ��ʾ����
	 * @return Books����
	 */
	public List<Books> getBooks(int pages,int pagesize);
	
	/**
	 * ��ȡ��ҳ��
	 * @param pagesize ÿҳ��ʾ����
	 * @return ��ҳ��
	 */
	public int getBookTotalPages(int pagesize);
	
	/***
	 * ����ͼ������ʾͼ����Ϣ
	 * @param bookid ͼ����
	 * @return 
	 */
	public Books getBookById(int bookid);
	
	/**
	 * ���ͼ����Ϣ
	 * @param b
	 * @return �Ƿ���ӳɹ�
	 */
	public boolean addBook(Books b);
	
	/**
	 * �޸�ͼ����Ϣ
	 * @param b ͼ�������Ϣ
	 * @return �Ƿ��޸ĳɹ�
	 */
	public boolean modifyBook(Books b);
	
	/**
	 * ɾ��ͼ��
	 * @param bookid ͼ����
	 * @return �Ƿ�ɾ���ɹ�
	 */
	public boolean deleteBook(int bookid);
	
	/**
	 * ������������ͼ����������ѯ
	 * @param bookname ����
	 * @return Books����
	 */
	public List<Books> getBooksByBookName(String bookname);
	
	/**
	 * ��������Ž���ͼ����������ѯ
	 * @param bookcode �����
	 * @return Books����
	 */
	public List<Books> getBooksByBookCode(String bookcode);
	
	/**
	 * ����ISBN����ͼ����������ѯ
	 * @param bookisbn ISBN
	 * @return Books����
	 */
	public List<Books> getBooksByBookIsbn(String bookisbn);
	
	/**
	 * ���ͼ�������Ϣ
	 * @param bt ͼ����������Ϣ
	 * @return �Ƿ���ӳɹ�
	 */
	public boolean addBooktype(Booktypes bt);
	
	/**
	 * �޸�ͼ�������Ϣ
	 * @param bt ͼ����������Ϣ
	 * @return �Ƿ��޸ĳɹ�
	 */
	public boolean modifyBooktype(Booktypes bt);
	
	/**
	 * ɾ��ͼ�����
	 * @param booktypeid ͼ�������
	 * @return �Ƿ�ɾ���ɹ�
	 */
	public boolean deleteBooktype(int booktypeid);
	
	/**
	 * ��ҳ��ʾͼ�������Ϣ
	 * @param pages ��ǰҳ
	 * @param pagesize ÿҳ��ʾ����
	 * @return Booktypes����
	 */
	public List<Booktypes> getBooktypes(int pages,int pagesize);
	
	/**
	 * ��ȡ��ҳ��
	 * @param pagesize ÿҳ��ʾ����
	 * @return ��ҳ��
	 */
	public int getBooktypeTotalPages(int pagesize);
	
	/***
	 * ����ͼ���������ʾͼ�������Ϣ
	 * @param booktypeid ͼ����
	 * @return 
	 */
	public Booktypes getBooktypeById(int booktypeid);
	
	/**
	 * ͼ���ѯ
	 * @param b ͼ�������
	 * @return Books����
	 */
	public List<Books> getBooksByBooktypeid(Books b);
	
	/**
	 * ��ȡ����ͼ�������Ϣ
	 * @return Booktypes����
	 */
	public List<Booktypes> getBooktypes();
	
	/**
	 * ��������������Ż�ISBN��ѯ
	 * @param b ����/�����/ISBN
	 * @return Books����
	 */
	public List<Books> getBooksBybooknamebookcodebookisbn(Books b);
	
	/**
	 * ����������ISBN�����������߲�ѯ
	 * @param b ����/ISBN/������/����
	 * @return Books����
	 */
	public List<Books> getBooksBybooknamebookisbnbookpublishbookauthor(Books b);
	
	/**
	 * ��ҳ��ʾ������ͼ����Ϣ
	 * @param pages ��ǰҳ
	 * @param pagesize ÿҳ��ʾ����
	 * @return Books����
	 */
	public List<Books> getBooksbybooktypeid(int pages,int pagesize,int booktypeid);
	
	/**
	 * ��ȡ������ͼ����ҳ��
	 * @param pagesize ÿҳ��ʾ����
	 * @return ��ҳ��
	 */
	public int getBookTotalPagesbybooktypeid(int pagesize,int booktypeid);
	
	/**
	 * ǰ̨����ͼ���Ż�ȡ��Ϣ
	 * @param bookid
	 * @return 
	 */
	public Books getBookinfos(int bookid);
	
	/**
	 * ��̨����ͼ���Ż�ȡ��Ϣ
	 * @param bookid
	 * @return 
	 */
	public Books getBookinfos1(int bookid);
	
	public Books getBooksByBookCodexdj(String bookcode);
}
