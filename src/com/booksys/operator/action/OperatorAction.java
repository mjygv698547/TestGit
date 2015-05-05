/**
 * 
 */
package com.booksys.operator.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.booksys.operator.dao.IOperatorDAO;
import com.booksys.po.Books;
import com.booksys.po.Operators;


/**
 * @author Administrator
 *
 */
public class OperatorAction implements ServletRequestAware,ServletResponseAware{
	
	private HttpServletRequest request;
	private HttpSession session;
	private HttpServletResponse response;
		
	private int pages = 1;
	private int pagesize = 3;
	
	private Operators o;
	/**
	 * 
	 */
	public OperatorAction() {
		// TODO Auto-generated constructor stub
	}

	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
		session = request.getSession();
	}

	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		response = arg0;		
	}
	
	/**
	 * 验证用户名是否可用的执行方法
	 * @return null 
	 */
	public String isAvaliableUsername(){
		IOperatorDAO iod =(IOperatorDAO) request.getAttribute("ioperatordao");
		String info = null;
		if(iod.checkUsername(o.getOusername())){
			//info="可用";
			info="<img src='images/ok.png' />";
		}else{
			//info="不可用";
			info="<img src='images/no.jpg' />";
		}
		//响应信息的字体设置
		//response.setContentType("html/text;charset=GB18030");
		//关于如何将数据传到页面上
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.println(info);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			pw.close();
		}
		return null;		
	}
	
	/**
	 * 操作员显示的执行方法
	 * @return Result Name
	 */
	public String showPages(){
		IOperatorDAO iod =(IOperatorDAO) request.getAttribute("ioperatordao");
		
		Integer totalpages = (Integer) session.getAttribute("totalpages");
		if(totalpages == null){
			totalpages = iod.getOperatorTotalPages(pagesize);
			session.setAttribute("totalpages", totalpages);
		}
		
		if(pages < 1){
			pages = 1; 
		}
		if(pages > totalpages){
			pages = totalpages;
		}
		List<Operators> list = iod.getOperators(pages, pagesize);
		request.setAttribute("operators", list);
		
		return "success";
	}
	
	/**
	 * 根据操作员编号获得操作员信息的执行方法
	 * @return Result Name
	 */
	public String showone(){
		IOperatorDAO iod = (IOperatorDAO) request.getAttribute("ioperatordao");
		Operators operators = iod.getOperatorById(o.getOperatorid());
		request.setAttribute("operators", operators);
		return "success";		
	}
	
	/**
	 * 添加操作员的执行方法
	 * @return Result Name
	 */
	public String addOperators(){
		IOperatorDAO iod = (IOperatorDAO) request.getAttribute("ioperatordao");
		System.out.println(o);
		System.out.println(o.getOrealname()+"  "+o.getOsex()+"  "+o.getOisadmin()+"  "+o.getOusername()+"  "+o.getOuserpwd());
		String info = null;
		try{
		if(iod.addOperator(o)){
			info = "操作员添加成功";
		}else{
			info = "操作员添加失败";
		}
		}catch(Exception e){
			info = "操作员添加失败";
		}
		request.setAttribute("info", info);
		return "success";
	}
	
	/**
	 * 修改操作员的执行方法
	 * @return Result Name
	 */
	public String modifyOperators(){
		IOperatorDAO iod = (IOperatorDAO) request.getAttribute("ioperatordao");
		//System.out.println(o);
		String info = null;
		try{
		if(iod.modifyOperator(o)){
			info = "操作员修改成功";
		}else{
			info = "操作员修改失败";
		}
		}catch(Exception e){
			info = "操作员修改失败";
		}
		request.setAttribute("info", info);
		return "success";
	}
	
	/**
	 * 删除操作员的执行方法
	 * @return Result Name
	 */
	public String deleteOperators(){
		IOperatorDAO iod = (IOperatorDAO) request.getAttribute("ioperatordao");
		String info = null;
		try{
		if(iod.deleteOperator(o.getOperatorid())){	
			info = "操作员删除成功";
		}else{
			info = "操作员删除失败";
		}
		}catch(Exception e){
			info = "操作员删除失败";
		}
		request.setAttribute("info", info);
		return "success";
	}

	/**
	 * @return the pages
	 */
	public int getPages() {
		return pages;
	}

	/**
	 * @param pages the pages to set
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}

	/**
	 * @return the o
	 */
	public Operators getO() {
		return o;
	}

	/**
	 * @param o the o to set
	 */
	public void setO(Operators o) {
		this.o = o;
	}

}
