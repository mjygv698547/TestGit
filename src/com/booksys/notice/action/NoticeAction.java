/**
 * 
 */
package com.booksys.notice.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.booksys.notice.dao.INoticeDAO;
import com.booksys.po.Notices;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class NoticeAction extends ActionSupport implements ServletRequestAware{
	
	/**
	 * 
	 */
	
	private Notices n;
	private HttpServletRequest request;
	private HttpSession session;
	private int pages = 1;
	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	private int pagesize =10;
	
	public String showPage(){
		return "success";
	}
	
	
	public Notices getN() {
		return n;
	}

	public void setN(Notices n) {
		this.n = n;
	}

	
	public String showpages(){
		INoticeDAO Ind = (INoticeDAO) request.getAttribute("inoticedao");
		
		Integer totalpages = (Integer) session.getAttribute("totalpages");
		
		if(totalpages ==null){
			totalpages = Ind.getTotalPages(pagesize);
			session.setAttribute("totalpages", totalpages);
		}

		if(pages<1){
			pages = 1;
		}
		if(pages >totalpages){
			pages = totalpages;
		}
		List<Notices> list = Ind.getNotices(pages, pagesize);                     
		request.setAttribute("notices", list);
		return "success";
	}

	

	public NoticeAction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public String AddNotice(){
		String info =null;
		try{
		INoticeDAO ind = (INoticeDAO) request.getAttribute("inoticedao");
		
	   if(ind.addNotice(n)){
		   request.setAttribute("success", "添加成功");
		   System.out.println("success");
		   return "success";
	   }else{
		   request.setAttribute("error", "添加失败");
		   System.out.println("error");
		   return "error";
	   }
		}catch(Exception e){
			info="添加失败";
		}
		request.setAttribute("info", info);
		return "error";
		
	}
	
	public String DeleteNotice(){
		String info =null;

		INoticeDAO ind = (INoticeDAO) request.getAttribute("inoticedao");
		int noticeId=Integer.parseInt(request.getParameter("tnoticeid"));
		
		int mount=ind.deleteNotice(noticeId);
		try{
			 ind = (INoticeDAO) request.getAttribute("inoticedao");
		if(mount==0){
			System.out.println("delete notice fail");
			return "fail";
		}
		}
		catch(Exception e){
			info="添加失败";
		}
		request.setAttribute("info", info);
		
	    return "success";
		
	}
	
	public String showone(){
		INoticeDAO ind = (INoticeDAO) request.getAttribute("inoticedao");
		
		Notices notices=ind.getNoticeById(n.getNoticeid());
		request.setAttribute("notices", notices);
		if(notices != null){
			System.out.println("##ttt");
			System.out.println(notices.getNoticecontent());
		}
		return "success";
	}
	
	
	public String editnotice(){
		INoticeDAO ind = (INoticeDAO) request.getAttribute("inoticedao");	
		String info = null;
		try{
		if(ind.editNotice(n)){
			info = "公告修改成功";
		}else{
			info = "公告修改失败";
		}
		}catch(Exception e){
			info = "公告修改失败";
		}
		request.setAttribute("info", info);
		return "success";
	}
	

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request=arg0;
		session = request.getSession();
		
	}

}


