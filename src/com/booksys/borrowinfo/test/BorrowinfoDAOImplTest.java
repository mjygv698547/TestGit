package com.booksys.borrowinfo.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.booksys.borrowinfo.dao.BorrowinfoDAOImpl;
import com.booksys.borrowinfo.dao.IBorrowinfoDAO;
import com.booksys.po.Borrowinfos;

public class BorrowinfoDAOImplTest {
  
	private IBorrowinfoDAO bfo ;
	@Before
	
	public void setUp() throws Exception {
		bfo = new BorrowinfoDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		bfo =null;
	}

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	//@Test
	public void testgetreaderandbookinfo(){
		Borrowinfos b = new Borrowinfos();
		b.setBookid(1);
		b.setReaderid(1);
		Borrowinfos bf =  bfo.getreaderandbookinfo(b);
		System.out.println(bf);
		System.out.println(bf.getBooks().getBookname());
	}
	//@Test
	public void testborrowbook(){
		Borrowinfos b = new Borrowinfos();
		b.setBookid(4);
		b.setReaderid(1);
		System.out.println(bfo.borrowbook(b));
	}
	//@Test
	public void testborrowbookupadtebook(){
		Borrowinfos b = new Borrowinfos();
		b.setBookid(10);
		System.out.println(bfo.borrowbookupadtebook(b));
	}
	//@Test
	public void testreturnbook(){
		Borrowinfos b = new Borrowinfos();
	
		System.out.println(bfo.returnbook(1));
	}
	//@Test
	public void testgetreturnbookinfo(){
		String str= "11-22-33";
		
		
		System.out.println(bfo.getreturnbookinfo(str));
	}
	//@Test
	public void testgetorderinfobybookid(){
		System.out.println(bfo.getorderinfobybookid(1));
	}
	//@Test
	public void testgetbookinfobybookname(){
		String str = "Èí¼þ¹¤³Ì";
		System.out.println(bfo.getbookinfobybookname(str));
	}
	//@Test
	public void testorderbookbybookid(){
		int bookid = 1;
		
		System.out.println(bfo.orderbookbybookid(bookid));
	}
	//@Test
	public void testeditborrowinfobybookidandreaderid(){
		Borrowinfos b = new Borrowinfos();
		b.setBookid(1);
		b.setReaderid(1);
		System.out.println(bfo.editborrowinfobybookidandreaderid(b));
		
	}
	//@Test
	public void testgetbookidbybookcode(){
		int i = bfo.getbookidbybookcode("11-22-33");
		System.out.println(i);
	}
	//@Test
	public void testgetorderbooklistbyreaderid(){
		System.out.println(bfo.getorderbooklistbyreaderid(1));
	}
	
	//@Test
	public void updatereborrowtimesandlastdate(){
		Borrowinfos b = new Borrowinfos();
		b.setBookid(1);
		b.setReaderid(1);
		b.setReborrowday(100);
		boolean f = bfo.updatereborrowtimesandlastdate(b);
		System.out.println(f);
		//System.out.println(bfo.updatereborrowtimesandlastdate(b));
		
	}
	//@Test
	public void testgetreaderstate(){
			
		List<Borrowinfos> bfs = bfo.getreaderstate(3);
		
		System.out.println(bfs.size());
	}
	

}
