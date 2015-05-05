/**
 * 
 */
package com.booksys.reader.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.booksys.po.Readers;
import com.booksys.reader.dao.IReaderDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class ReaderLoginAction implements ServletRequestAware{
	private HttpSession session;
	private HttpServletRequest request;
	private Readers r;
	public Readers getR() {
		return r;
	}

	public void setR(Readers r) {
		this.r = r;
	}

	/**
	 * 
	 */
	public ReaderLoginAction() {
		// TODO Auto-generated constructor stub
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
		session = request.getSession();
	}
	public String topage(){
		return "success";
	}
	public String readerlogin(){
		IReaderDAO ird =(IReaderDAO) request.getAttribute("ireaderdao");
		System.out.println(ird);
		try{
		Readers reader = ird.readerlogin(r);
		session.setAttribute("reader", reader);
		if(reader != null){
			return "success";
		}else{
			request.setAttribute("info", "输入有误");
			return "error";
		}}catch(Exception e){
			request.setAttribute("info", "输入有误");
			return "error";
		}
	}
	public String readerexit(){
		session.removeAttribute("reader");
		request.setAttribute("info", "退出成功！");
		return "success";
	}
	

}
