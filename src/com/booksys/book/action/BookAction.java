/**
 * 
 */
package com.booksys.book.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.booksys.book.dao.IBookDAO;
import com.booksys.po.Books;
import com.booksys.po.Booktypes;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 * 
 */
public class BookAction extends ActionSupport implements ServletRequestAware {
	private HttpServletRequest request;
	private HttpSession session;

	private Books b;
	private Booktypes bt;

	private int pages = 1;
	private int pagesize = 3;
	private int pages1 = 1;
	private int pagesize1 = 2;
	private int pages2 = 1;
	private int pagesize2 = 2;

	/**
	 * 
	 */
	public BookAction() {
		// TODO Auto-generated constructor stub
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
		session = request.getSession();
	}

	/**
	 * ͼ����ʾ��ִ�з���
	 * 
	 * @return Result Name
	 */
	public String showPages() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");

		Integer totalpages = (Integer) session.getAttribute("totalpages");
		if (totalpages == null) {
			totalpages = ibd.getBookTotalPages(pagesize);
			session.setAttribute("totalpages", totalpages);
		}

		if (pages < 1) {
			pages = 1;
		}
		if (pages > totalpages) {
			pages = totalpages;
		}
		List<Books> list = ibd.getBooks(pages, pagesize);
		request.setAttribute("books", list);

		return "success";
	}

	/**
	 * ͼ�������ʾ��ִ�з�������ɾ���޸ģ�
	 * 
	 * @return Result Name
	 */
	public String showPagesbooktype() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");

		Integer totalpages1 = (Integer) session.getAttribute("totalpages1");
		if (totalpages1 == null) {
			totalpages1 = ibd.getBooktypeTotalPages(pagesize1);

			session.setAttribute("totalpages1", totalpages1);
		}

		if (pages1 < 1) {
			pages1 = 1;
		}
		if (pages1 > totalpages1) {
			pages1 = totalpages1;
		}
		List<Booktypes> list = ibd.getBooktypes(pages1, pagesize1);
		request.setAttribute("booktypes", list);

		return "success";
	}

	/**
	 * ����ͼ���Ż��ͼ����Ϣ��ִ�з���
	 * 
	 * @return Result Name
	 */
	public String showone() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		Books books = ibd.getBookById(b.getBookid());
		request.setAttribute("books", books);
		return "success";
	}

	/**
	 * ���ͼ���ִ�з���
	 * 
	 * @return Result Name
	 */
	public String addBooks() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		String info = null;
		if(b.getBookname()==null||b.getBookauthor()==null||b.getBookisbn()==null||b.getBookpublish()==null||b.getBookpublishdate()==null){
			info="ȱ����Ϣ��";
		}else{
		if (ibd.addBook(b)) {
			info = "ͼ����ӳɹ�";
		} else {
			info = "ͼ�����ʧ��";
		}
		}
		request.setAttribute("info", info);
		request.setAttribute("book", b);
		return "success";
	}

	/**
	 * �޸�ͼ���ִ�з���
	 * 
	 * @return Result Name
	 */
	public String modifyBooks() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		String info = null;
		if (ibd.modifyBook(b)) {
			info = "ͼ���޸ĳɹ�";
		} else {
			info = "ͼ���޸�ʧ��";
		}
		request.setAttribute("info", info);
		return "success";
	}

	/**
	 * ɾ��ͼ���ִ�з���
	 * 
	 * @return Result Name
	 */
	public String deleteBooks() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		String info = null;
		if (ibd.deleteBook(b.getBookid())) {
			info = "ͼ��ɾ���ɹ�";
		} else {
			info = "ͼ��ɾ��ʧ��";
		}
		request.setAttribute("info", info);
		return "success";
	}

	/**
	 * ��������������Ľ��������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String querybookbyname() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		List<Books> list = ibd.getBooksByBookName(b.getBookname());
		if (list.size() > 0) {
			request.setAttribute("books", list);
		} else {
			request.setAttribute("info", "û���ҵ�����Ҫ���ͼ����Ϣ");
		}
		return "success";
	}

	/**
	 * ��������Ų�����Ľ��������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String querybookbycode() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		List<Books> list = ibd.getBooksByBookCode(b.getBookcode());
		if (list.size() > 0) {
			request.setAttribute("books", list);
		} else {
			request.setAttribute("info", "û���ҵ�����Ҫ���ͼ����Ϣ");
		}
		return "success";
	}

	/**
	 * ����ISBN������Ľ��������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String querybookbyisbn() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		List<Books> list = ibd.getBooksByBookIsbn(b.getBookisbn());
		if (list.size() > 0) {
			request.setAttribute("books", list);
		} else {
			request.setAttribute("info", "û���ҵ�����Ҫ���ͼ����Ϣ");
		}
		return "success";
	}

	/**
	 * ��������/�����/ISBN������Ľ��������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String querybookbynamecodeisbn() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		List<Books> list = ibd.getBooksBybooknamebookcodebookisbn(b);
		if (list.size() > 0) {
			request.setAttribute("books", list);
		} else {
			request.setAttribute("info", "û���ҵ�����Ҫ���ͼ����Ϣ");
		}
		return "success";
	}

	/**
	 * ��������/ISBN/������/���߲�����Ľ��������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String querybookbynameisbnpublishauthor() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		List<Books> list = ibd
				.getBooksBybooknamebookisbnbookpublishbookauthor(b);
		if (list.size() > 0) {
			request.setAttribute("books", list);
		} else {
			request.setAttribute("info", "û���ҵ�����Ҫ���ͼ����Ϣ");
		}
		return "success";
	}

	/**
	 * ���ͼ������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String addBooktypes() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		String info = null;
		String infos = null;
		try{
		if(bt.getBooktypename()==null||bt.getBooktypelocation()==null){
			info = "������λ��Ϊ�գ�";
		}else{
		if (ibd.addBooktype(bt)) {
			info = "ͼ�������ӳɹ�";
		} else {
			info = "ͼ��������ʧ��";
		}
		}
		}catch(Exception e){
			infos="�����ʽ����";
		}
		request.setAttribute("info", info);
		request.setAttribute("infos", infos);
		return "success";
	}

	/**
	 * �޸�ͼ������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String modifyBooktypes() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		String info = null;
		if (ibd.modifyBooktype(bt)) {
			info = "ͼ������޸ĳɹ�";
		} else {
			info = "ͼ������޸�ʧ��";
		}
		request.setAttribute("info", info);
		return "success";
	}

	/**
	 * ɾ��ͼ������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String deleteBooktypes() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		String info = null;
		try {
			info = "ͼ�����ɾ���ɹ�";
			if (ibd.deleteBooktype(bt.getBooktypeid())) {
				info = "ͼ�����ɾ��ʧ��";
			}
		} catch (Exception e) {
			info = "ͼ�����ɾ��ʧ��";
		}
		request.setAttribute("info", info);
		return "success";
	}

	/**
	 * ͼ�������ʾ��ִ�з���
	 * 
	 * @return Result Name
	 */
	public String showPagest() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");

		Integer totalpages = (Integer) session.getAttribute("totalpages");
		if (totalpages == null) {
			totalpages = ibd.getBookTotalPagesbybooktypeid(pagesize,
					bt.getBooktypeid());
			session.setAttribute("totalpages", totalpages);
		}

		if (pages < 1) {
			pages = 1;
		}
		if (pages > totalpages) {
			pages = totalpages;
		}
		List<Booktypes> list = ibd.getBooktypes(pages, pagesize);
		request.setAttribute("booktypes", list);

		return "success";
	}

	/**
	 * ����ͼ������Ż��ͼ�������Ϣ��ִ�з���
	 * 
	 * @return Result Name
	 */
	public String showonet() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		Booktypes booktypes = ibd.getBooktypeById(bt.getBooktypeid());
		request.setAttribute("booktypes", booktypes);
		return "success";
	}

	/**
	 * ͼ���ѯ������ִ�з���
	 * 
	 * @return Result Name
	 */
	public String queryBook() {
		IBookDAO ied = (IBookDAO) request.getAttribute("ibookdao");
		List<Books> list = ied.getBooksByBooktypeid(b);
		if (list.size() > 0) {
			request.setAttribute("books", list);
			request.setAttribute("booktypeid", b.getBooktypeid());
		} else {
			request.setAttribute("info", "û���ҵ�����Ҫ���ͼ����Ϣ");
		}
		return "success";
	}

	/**
	 * ��ȡ����ͼ������ִ�з���(ʹ��session�������ݴ���)
	 * 
	 * @return Result Name
	 */
	public String showBooktypes() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		List<Booktypes> list = (List<Booktypes>) session.getAttribute("booktypes");// û�б�Ҫ���������ݿ�����ȡ

		if (list == null) {
			list = ibd.getBooktypes();
			session.setAttribute("booktypes", list);
		}
		request.setAttribute("booktypeid", "-1");

		return "success";
	}

	/**
	 * ��ȡͼ����ϸ��Ϣ
	 * 
	 * @return
	 */
	public String getbookinfo() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		Books books = ibd.getBookinfos(b.getBookid());
		request.setAttribute("books", books);
		return "success";
	}

	/**
	 * ��̨��ȡͼ����ϸ��Ϣ
	 * 
	 * @return
	 */
	public String getbookinfo1() {
		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		Books books = ibd.getBookinfos1(b.getBookid());
		request.setAttribute("books", books);
		return "success";
	}

	/**
	 * ����ͼ�������ʾͼ����Ϣ
	 * 
	 * @return Result Name
	 */
	public String showPagesbybooktype() {

		IBookDAO ibd = (IBookDAO) request.getAttribute("ibookdao");
		// List<Booktypes> list1 = (List<Booktypes>)
		// session.getAttribute("booktypes");
		Integer totalpages2 = (Integer) session.getAttribute("totalpages2");
		System.out.println(totalpages2);

		System.out.println(b.toString());
		totalpages2 = ibd.getBookTotalPagesbybooktypeid(pagesize2,
				b.getBooktypeid());
		session.setAttribute("totalpages2", totalpages2);

		if (pages2 < 1) {
			pages2 = 1;
		}
		if (pages2 > totalpages2) {
			pages2 = totalpages2;
		}

		List<Books> list = ibd.getBooksbybooktypeid(pages2, pagesize2,
				b.getBooktypeid());
		// System.out.println(b.getBooktypeid());
		for (Books b : list) {
			b.getBookid();
		}
		request.setAttribute("books", list);
		request.setAttribute("booktypeid", b.getBooktypeid());

		return "success";
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages
	 *            the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the b
	 */
	public Books getB() {
		return b;
	}

	/**
	 * @param b
	 *            the b to set
	 */
	public void setB(Books b) {
		this.b = b;
	}

	/**
	 * @return the bt
	 */
	public Booktypes getBt() {
		return bt;
	}

	/**
	 * @param bt
	 *            the bt to set
	 */
	public void setBt(Booktypes bt) {
		this.bt = bt;
	}

	/**
	 * @return the pages1
	 */
	public int getPages1() {
		return pages1;
	}

	/**
	 * @param pages1
	 *            the pages1 to set
	 */
	public void setPages1(int pages1) {
		this.pages1 = pages1;
	}

	/**
	 * @return the pages2
	 */
	public int getPages2() {
		return pages2;
	}

	/**
	 * @param pages2
	 *            the pages2 to set
	 */
	public void setPages2(int pages2) {
		this.pages2 = pages2;
	}

}
