package com.booksys.reader.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.booksys.po.Readers;
import com.booksys.reader.dao.IReaderDAO;
import com.booksys.reader.dao.ReaderDAOImpl;

public class ReaderDAOImplTest {

	private IReaderDAO ird;
	@Before
	public void setUp() throws Exception {
		ird = new ReaderDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		ird = null;
	}

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	//@Test
	public void testgetregulationbyreaderid(){
		Readers r = new Readers();
		r.setReaderid(1);
		Readers reader =ird.getregulationbyreaderid(r);
		System.out.println(reader);
	}
//	@Test
//	public void testgetdaterestborrowday(){
//		Readers r = new Readers();
//		r.setReaderid(1);
//		Date day = ird.getdaterestborrowday(r);
//		System.out.println(day);
//	}
	
//	@Test
	public void testreaderlogin(){
		Readers r = new Readers();
		r.setReaderid(1);
		r.setReaderpwd("123456");
		Readers reader = ird.readerlogin(r);
		System.out.println(reader);
	}
//	@Test
	public void getreaderxdj(){
		System.out.println(ird.getreaderxdj(1).getReadername());
	}
	

	
//	@Test
	public void testaddreader(){
		Readers r = new Readers();
		r.setReaderid(122331);
		r.setReadername("lolitb");
		r.setReaderidcard("1234567890");
	
		r.setEffectivedate(Date.valueOf("2010-8-09"));
		r.setDeaddate(Date.valueOf("2010-8-09"));
		r.setCash(30.2);
		r.setTelephone(123445541);
		r.setRegulationid(1);
		
		boolean i = ird.addreader(r);
		System.out.println(i);
		
	}
	//@Test 
	public void testgetreaderlist(){
		List<Readers>readers=ird.getreaderlist();
		System.out.println(readers);
	}
	//@Test
	public void testgetreaderbyreaderid(){
		System.out.println(ird.getreaderbyreaderid(1));
	}
	//@Test
	public void testupdatereaderdeaddate(){
		Readers r = new Readers();
		r.setReaderid(1);
		r.setDeaddate(Date.valueOf("2010-8-09"));
		System.out.println(ird.updatereaderdeaddate(r));
		
	}
	//@Test
	public void testdeletereaderbyreaderid(){
		Readers r = new Readers();
		r.setReaderid(1);
		System.out.println(ird.deletereaderbyreaderid(r.getReaderid()));
	}
	@Test
	public void testturnreaderidcardtoreaderid(){
		
		int i = ird.turnreaderidcardtoreaderid("330111111111111111");
		System.out.println(i);
	}
	
	
}
