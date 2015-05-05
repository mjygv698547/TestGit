/**
 * 
 */
package com.booksys.reader.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.booksys.borrowinfo.dao.IBorrowinfoDAO;
import com.booksys.po.Borrowinfos;
import com.booksys.po.Readers;
import com.booksys.reader.dao.IReaderDAO;
import com.booksys.reader.dao.ReaderDAOImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class ReaderAction extends ActionSupport implements ServletRequestAware{
	private HttpServletRequest request;
	private HttpSession session;
	/**
	 * 
	 */
	private Readers r;
	public Readers getR() {
		return r;
	}

	public void setR(Readers r) {
		this.r = r;
	}

	public ReaderAction() {
		// TODO Auto-generated constructor stub
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
		session = request.getSession();
	}
	
	public String xdjaddreader(){
		String info=null;
		try{
		System.out.println(r.getReaderid());
		IReaderDAO ird = (IReaderDAO) request.getAttribute("ireaderdao");
		System.out.println(r.getReadername());
	
		boolean result = ird.addreader(r);
		
		if(result){
			info="添加成功！";
			
		}else{
			info="添加失败";
		}
		}catch(Exception e){
			info="格式有误！";
		}
		request.setAttribute("info", info);
		return "success";
	}
	
	
	public String showreaderlist(){
		IReaderDAO ird = (IReaderDAO) request.getAttribute("ireaderdao");
		String info=null;
		try{
		List<Readers>readers=ird.getreaderlist();
		request.setAttribute("readerlist",readers);
		}catch(Exception e){
			
		}
		return "success";
	}
	public String toupdatereadercreatedate(){
		IReaderDAO ird = (IReaderDAO) request.getAttribute("ireaderdao");
		Readers reader = ird.getreaderbyreaderid(r.getReaderid());
		System.out.println(reader.getReadername());
		request.setAttribute("reader",reader);
		return "success";
	}
	public String xdjupdatereaderdeaddate(){
		IReaderDAO ird = (IReaderDAO) request.getAttribute("ireaderdao");
		String info=null;
		try{
		if(ird.updatereaderdeaddate(r)){
			Readers reader = ird.getreaderbyreaderid(r.getReaderid());
			request.setAttribute("info", "修改成功！");
			request.setAttribute("reader",reader);
		}else{
			request.setAttribute("info", "修改失败！");
		}
		}catch(Exception e){
			request.setAttribute("info", "修改失败！");
		}
		return "success";
	}
	
	public String deletereaderbyreaderid(){
		IReaderDAO ird = (IReaderDAO) request.getAttribute("ireaderdao");
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		String info = null;
		try{
		if(ibd.getreaderstate(r.getReaderid()).size()==0){
		
		if(ird.deletereaderbyreaderid(r.getReaderid())){
			
			
		}else{
			
		} 
		}
		else{
			info= "这位学生还有书未还，不能删除！";
		}
		List<Readers>readers=ird.getreaderlist();
		request.setAttribute("readerlist",readers);
		request.setAttribute("info", info);
		}catch(Exception e){
			info="操作失败！" ;
		}
		request.setAttribute("info", info);
		return "success";
	}
	
	//cym
	public String repassword(){
		Readers reader = (Readers) session.getAttribute("reader");
		int readerid = reader.getReaderid();
		System.out.println(readerid);
		IReaderDAO ird = (IReaderDAO) request.getAttribute("ireaderdao");	
		
		String info = null;
		System.out.println(r.getReaderid()+"###");
		
		
		if(ird.editReader(r)){
			info = "密码修改成功";
			request.setAttribute("info", info);
			
			return "success";
		}else{
			info = "密码修改失败";
			request.setAttribute("info", info);
			return "error";
		}
	}
	//cym

}
