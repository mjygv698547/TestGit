/**
 * 
 */
package com.booksys.regulation.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.booksys.po.Regulations;
import com.booksys.regulation.dao.IRegulationDAO;
import com.opensymphony.xwork2.ActionSupport;


/**
 * @author Administrator
 *
 */
public class RegulationAction extends ActionSupport implements ServletRequestAware {

	/**
	 * 
	 */
	public RegulationAction() {
		// TODO Auto-generated constructor stub
	}

	private Regulations r;
	private HttpServletRequest request;
	private HttpSession session;
	private int pages = 1;
	private int pagesize =10;
	
	public void setR(Regulations r) {
		this.r = r;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String showPage(){
		return "success";
	}
	
	
	public Regulations getR() {
		return r;
	}


	
	public String showpages(){
		IRegulationDAO Irtd = (IRegulationDAO) request.getAttribute("iregulationdao");
		
		Integer totalpages = (Integer) session.getAttribute("totalpages");
		String info=null;
		try{
		if(totalpages ==null){
			totalpages = Irtd.getTotalPages(pagesize);
			session.setAttribute("totalpages", totalpages);
		}

		if(pages<1){
			pages = 1;
		}
		if(pages >totalpages){
			pages = totalpages;
		}
		List<Regulations> list = Irtd.getRegulations(pages, pagesize);    
		System.out.println(list.size());
		request.setAttribute("regulations", list);
		}catch(Exception e){
			
		}
		return "success";
	}



	/**
	 * @param args
	 */
	public String AddRegulation(){
		IRegulationDAO Irtd = (IRegulationDAO) request.getAttribute("iregulationdao");
		String info=null;
		try{
	   if(Irtd.addRegulation(r)){
		   request.setAttribute("success", "添加成功");
		   System.out.println("success");
		   return "success";
	   }else{
		   request.setAttribute("error", "添加失败");
		   System.out.println("error");
		   return "error";
	   }
		}catch(Exception e){
			request.setAttribute("error", "添加失败");
		}
		  return "error";
	}
	
	public String DeleteRegulation(){
		IRegulationDAO Irtd = (IRegulationDAO) request.getAttribute("iregulationdao");
		String info=null;
		try{
		int noticeId=Integer.parseInt(request.getParameter("tregulationid"));
		int mount=Irtd.deleteRegulation(noticeId);
		if(mount==0){
			System.out.println("delete Regulation fail");
			return "fail";
		}
		}
		catch(Exception e){
			request.setAttribute("error", "添加失败");
		}
	    return "success";
		
	}
	
	public String showone(){
		IRegulationDAO Irtd = (IRegulationDAO) request.getAttribute("iregulationdao");
		
		Regulations Regulations=Irtd.getRegulationById(r.getRegulationid());
		System.out.println(Regulations.getRegulationname());
		request.setAttribute("Regulations", Regulations);
		System.out.println(((Regulations)request.getAttribute("Regulations")).getRegulationname());
		if(Regulations != null){
			System.out.println("##ttt");
		}
		return "success";
	}
	
	
	public String editregulation(){
		IRegulationDAO Irtd = (IRegulationDAO) request.getAttribute("iregulationdao");	
		String info = null;
		try{
		if(Irtd.editRegulation(r)){
			info = "规则修改成功";
		}else{
			info = "规则修改失败";
		}
		}catch(Exception e){
			info = "规则修改失败";
		}
		request.setAttribute("info", info);
		return "success";
	}
	

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request =arg0;
		session = request.getSession();
		
	}
}
