/**
 * 
 */
package com.booksys.borrowinfo.action;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.booksys.book.dao.IBookDAO;
import com.booksys.borrowinfo.dao.IBorrowinfoDAO;
import com.booksys.po.Books;
import com.booksys.po.Borrowinfos;
import com.booksys.po.Readers;
import com.booksys.po.Regulations;
import com.booksys.reader.dao.IReaderDAO;
import com.booksys.regulation.dao.IRegulationDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class BorrowinfoAction extends ActionSupport implements
		ServletRequestAware {

	/**
	 * 
	 */
	private HttpServletRequest request;
	private HttpSession session;
	private Borrowinfos bf;
	private Readers r;
	private Books b;
	private Borrowinfos tempborrowinfosinfo = new Borrowinfos();
	private int pages = 1;
	private int pagesize =10;
	private int rreaderid;
	
	
	
	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPagesize() {
		return pagesize;
	}

	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}

	public int getRreaderid() {
		return rreaderid;
	}

	public void setRreaderid(int rreaderid) {
		this.rreaderid = rreaderid;
	}

	public Books getB() {
		return b;
	}

	public void setB(Books b) {
		this.b = b;
	}

	public Readers getR() {
		return r;
	}

	public void setR(Readers r) {
		this.r = r;
	}

	public Borrowinfos getBf() {
		return bf;
	}

	public void setBf(Borrowinfos bf) {
		this.bf = bf;
	}

	public BorrowinfoAction() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.apache.struts2.interceptor.ServletRequestAware#setServletRequest(javax.servlet.http.HttpServletRequest)
	 */
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
		session = request.getSession();

	}
	/***
	 * 得到读者和书籍信息
	 */
	
	
	//cym
	public String showpages(){
		IBorrowinfoDAO ibid = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		Integer totalpages = (Integer) session.getAttribute("totalpages");
		
		System.out.println(rreaderid+"@@@");
		
		if(totalpages ==null){
			totalpages = ibid.getTotalPages(pagesize);
			session.setAttribute("totalpages", totalpages);
		}

		if(pages<1){
			pages = 1;
		}
		if(pages >totalpages){
			pages = totalpages;
		}
		request.setAttribute("rreaderid", rreaderid);
		List<Borrowinfos> list = ibid.getBorrowinfos(pages, pagesize,rreaderid);      
		System.out.println(list.size()+"***"+pages+pagesize+rreaderid);
		request.setAttribute("Borrowinfo1", list);
		System.out.println(list.size());
		return "success";
	}
	//cym
	
	public String getreaderandbookinfo(){
		System.out.println(bf.getReaderid());
		String bookstate = null;
		try{
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		IBookDAO ib = (IBookDAO) request.getAttribute("ibookdao");
		IReaderDAO ird = (IReaderDAO) request.getAttribute("ireaderdao");
		System.out.println(bf.getReaderid());
		Readers reader = ird.getreaderxdj(bf.getReaderid());
		
		System.out.println(reader.getReadername());
		Books books = ib.getBooksByBookCodexdj(b.getBookcode());
		System.out.println("bookid="+books.getBookid());
		bf.setBookid(books.getBookid());
		String flag=null;
		
		
		System.out.println("OK");
		request.setAttribute("reader", reader);
		request.setAttribute("books", books);
		int state = books.getBookstate();
		if(state==0){
			bookstate="未借";
		}
		if(state==1){
			bookstate="已借";
			flag="不可借";
		}
		if(state==2){
			bookstate="已被预约";
			flag="不可借";
		}
		
		request.setAttribute("bookstate", bookstate);
		request.setAttribute("flag",flag);
		}catch(Exception e){
			request.setAttribute("info", "输入格式有误！");
		}
		return "success";
	
	}
//		bf.setBookid(ibd.getbookidbybookcode(b.getBookcode()));
//		Borrowinfos bfs = ibd.getreaderandbookinfo(bf);
//		
//		bfs.setBookid(ibd.getbookidbybookcode(b.getBookcode()));
//		
//		bfs.setReaderid(bf.getReaderid());
//	if(bfs != null){
//		int state = bfs.getBooks().getBookstate();
//		if(state==0){
//			bookstate="未借";
//		}
//		if(state==1){
//			bookstate="已借";
//		}
//		if(state==2){
//			bookstate="已被预约";
//		}
//		request.setAttribute("bookstate", bookstate);
//		request.setAttribute("readerandbook", bfs);
//		   return "success";
//		}
//		else{
//		   return "error";
//		}
//	}
	
	public String borrowbook(){
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		IReaderDAO ird =(IReaderDAO) request.getAttribute("ireaderdao"); 
        //r.setReaderid(bf.getReaderid());
      
        Readers reader = new Readers();
        try{
        reader.setReaderid(bf.getReaderid());
//		Readers readers = ird.getregulationbyreaderid(reader);
//		int d = readers.getRegulations().getRestborrowday();
//		Date day = ibd.getDate();
//		Calendar cal=Calendar.getInstance();
//		cal.add(Calendar.DAY_OF_YEAR, d);
//		long date= cal.getTimeInMillis();
//		Date days = new Date(date);
//		bf.setLastdate(days);
		
		Readers rule = ird.getregulationbyreaderid(reader);
		
		bf.setReborrowday(rule.getRegulations().getReborrowday());
		boolean flag1 = ibd.borrowbookupadtebook(bf);
		boolean flag2 = ibd.borrowbook(bf);
		if(flag1&&flag2){
			request.setAttribute("info","借书成功!");
			Borrowinfos bfs = ibd.getreaderandbookinfo(bf);
			System.out.println(bfs.getBorrowdate());
			request.setAttribute("time", bfs);
			request.setAttribute("bookname", b.getBookname());
		}else{
			request.setAttribute("info","借书失败!");
			
		}
        }catch(Exception e){
        	request.setAttribute("info","输入格式有误!");
        }
		return "success";
		
		
	}
	/***
	 * 根据bookcode获得信息
	 * @return
	 */
	public String getreturnbookinfobybookcode(){
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		try{
		Borrowinfos borrowinfos = ibd.getreturnbookinfo(b.getBookcode());
		
		request.setAttribute("borrowinfos",borrowinfos);
		
		System.out.println("getreturnbookinfobybookcode"+borrowinfos.getBorrowinfosid());
		String bookstate=null;
		int state = borrowinfos.getBooks().getBookstate();
		if(state==0){
			bookstate="未借";
		}
		if(state==1){
			bookstate="已借";
		}
		if(state==2){
			bookstate="已被预约";
			
		}
		request.setAttribute("bookstate", bookstate);
		}catch(Exception e){
			request.setAttribute("info", "输入格式错误！");
		}
		return "success";
	}
	
	public String  returnbook(){
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		try{
		int borrowinfosid = bf.getBorrowinfosid();
		int bookid = b.getBookid();
		System.out.println(borrowinfosid);
		int i = b.getBookstate();
		if(i == 2){
			Borrowinfos borrowinfos = ibd.getorderinfobybookid(bookid);
			request.setAttribute("orderinfo",borrowinfos);
		}
		if(ibd.returnbook(borrowinfosid)){
			request.setAttribute("info", "归还成功");
		}else{
			request.setAttribute("info", "归还失败");
		}}catch(Exception e){
			request.setAttribute("info", "输入格式有误！");
		}
		
		return "success";
	}
	
	
	/***
	 * 预约
	 */
	public String getbookinfobybookname(){
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		try{
		Books books = ibd.getbookinfobybookname(b.getBookname());
		request.setAttribute("books", books);
		int state = books.getBookstate();
		String bookstate = null;
		if(state==0){
			bookstate="未借";
		}
		if(state==1){
			bookstate="已借";
		}
		if(state==2){
			bookstate="已被预约";	
		}
		request.setAttribute("bookstate", bookstate);
		System.out.println(books);
		}catch(Exception e){
			request.setAttribute("info", "输入有误！");
		}
		return "success";
	}
	
	
	public String editborrowinfobybookidandreaderid(){
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		int bookid = b.getBookid();
		IReaderDAO ird =(IReaderDAO) request.getAttribute("ireaderdao"); 
		int  readerid =0;
		try{
		  readerid = r.getReaderid();
		}catch(Exception e){
		 readerid = ird.turnreaderidcardtoreaderid(r.getReaderidcard());
		}
		
		
			
		
		String info= null;
		
		Borrowinfos borrowinfos = new Borrowinfos();
		borrowinfos.setBookid(bookid);
		borrowinfos.setReaderid(readerid);
		
		boolean flag1 = ibd.editborrowinfobybookidandreaderid(borrowinfos);
		boolean flag2 = ibd.orderbookbybookid(bookid);
		if(flag1&&flag2){
			info="预约成功";
		}else{
			info="预约失败";
		}
		request.setAttribute("info", info);
		return "success";
	}
	public String  getorderbooklistbyreaderid(){
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		try{
		Readers reader = (Readers) session.getAttribute("reader");
		IReaderDAO ird =(IReaderDAO) request.getAttribute("ireaderdao"); 
		Readers re= ird.getregulationbyreaderid(reader);
		request.setAttribute("maxreborrow", re.getRegulations().getMaxreborrowtime());
		List<Borrowinfos>borrowinfos = ibd.getorderbooklistbyreaderid(reader.getReaderid());
		request.setAttribute("borrowinfos",borrowinfos);
		}catch( Exception e){
			
		}
		return "success";
	}
	
	
	public String updatereborrowtimesandlastdate(){
		IBorrowinfoDAO ibd = (IBorrowinfoDAO) request.getAttribute("iborrowinfodao");
		IReaderDAO ird =(IReaderDAO) request.getAttribute("ireaderdao"); 
		
		Readers reader = (Readers) session.getAttribute("reader");
		Readers re= ird.getregulationbyreaderid(reader);
		
		request.setAttribute("maxreborrow", re.getRegulations().getMaxreborrowtime());
		
		System.out.println(re.getRegulations().getMaxreborrowtime());
		Borrowinfos borrowinfos = new Borrowinfos();
		borrowinfos.setBookid(bf.getBookid());
		borrowinfos.setReaderid(reader.getReaderid());
		borrowinfos.setReborrowday(100);
		String info =null;
		if(ibd.updatereborrowtimesandlastdate(borrowinfos)){
		     info = "续借成功！";
		     
		     getorderbooklistbyreaderid();
		     List<Borrowinfos>borrowinfo = ibd.getorderbooklistbyreaderid(reader.getReaderid());
		     request.setAttribute("borrowinfos",borrowinfo);
		}else{
		     info = "续借失败！";
		}
		request.setAttribute("info", info);
		return "success";
	}
	
	
	
	

}
