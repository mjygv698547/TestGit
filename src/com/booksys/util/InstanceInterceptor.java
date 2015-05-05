/**
 * 
 */
package com.booksys.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.booksys.book.dao.BookDAOImpl;
import com.booksys.book.dao.IBookDAO;
import com.booksys.borrowinfo.dao.BorrowinfoDAOImpl;
import com.booksys.borrowinfo.dao.IBorrowinfoDAO;
import com.booksys.notice.dao.INoticeDAO;
import com.booksys.notice.dao.NoticeDAOImpl;
import com.booksys.operator.dao.IOperatorDAO;
import com.booksys.operator.dao.OperatorDAOImpl;
import com.booksys.reader.dao.IReaderDAO;
import com.booksys.reader.dao.ReaderDAOImpl;
import com.booksys.regulation.dao.IRegulationDAO;
import com.booksys.regulation.dao.RegulationDAOImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * @author Administrator
 *
 */
public class InstanceInterceptor implements Interceptor {

	private IBookDAO ibd;
	private IBorrowinfoDAO ibid;
	private INoticeDAO ind;
	private IOperatorDAO iod;
	private IReaderDAO ird;
	private IRegulationDAO irtd;
	/**
	 * 
	 */
	public InstanceInterceptor() {
		// TODO Auto-generated constructor stub
	}


	public void destroy() {
		// TODO Auto-generated method stub
		ibd = null;
		ibid = null;
		ind = null;
		iod = null;
		ird = null;
		irtd = null;
	}


	public void init() {
		// TODO Auto-generated method stub
		ibd = new BookDAOImpl();
		ibid = new BorrowinfoDAOImpl();
		ind = new NoticeDAOImpl();
		iod = new OperatorDAOImpl();
		ird = new ReaderDAOImpl();
		irtd = new RegulationDAOImpl();
	}


	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		ActionContext ac = arg0.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) ac.get(ServletActionContext.HTTP_REQUEST);

		request.setAttribute("ibookdao", ibd);
		request.setAttribute("iborrowinfodao", ibid);
		request.setAttribute("inoticedao", ind);
		request.setAttribute("ioperatordao", iod);
		request.setAttribute("ireaderdao", ird);
		request.setAttribute("iregulationdao", irtd);
		
		String result = arg0.invoke();
		return result;
	}

}