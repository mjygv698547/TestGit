package com.booksys.operator;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.booksys.operator.dao.IOperatorDAO;
import com.booksys.operator.dao.OperatorDAOImpl;
import com.booksys.po.Operators;

public class OperatorDAOImplTest {

	private IOperatorDAO iod;
	@Before
	public void setUp() throws Exception {
		iod = new OperatorDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
	}

	//@Test
	public void testCheckLogin() {
		Operators o = new Operators();
		o.setOusername("Tom");
		o.setOuserpwd("123456");
		
		Operators op = iod.checkLogin(o);
		System.out.println(op.getOrealname()+"  "+op.getOuserpwd());
		assertNull(op);
	}
	
	//@Test
	public void testCheckUsername(){
		assertTrue(iod.checkUsername("Tom1"));
		assertFalse(iod.checkUsername("Tom"));
	}
	
	//@Test
	public void testCheckRealname(){
		assertTrue(iod.checkUsername(""));
		assertFalse(iod.checkUsername(""));
	}
	
	//@Test
	public void testCheckOperatorpwd(){
		assertTrue(iod.checkUsername("Tom1"));
		assertFalse(iod.checkUsername("Tom"));
	}
	
	//@Test
	public void testCheckreOperatorpwd(){
		assertTrue(iod.checkUsername("Tom1"));
		assertFalse(iod.checkUsername("Tom"));
	}
	
	//@Test
	public void testGetBooks() {
		List<Operators> list = iod.getOperators(2, 1);
		for(Operators o : list){
			System.out.println(o.getOperatorid()+"  "+o.getOusername()+"  "+o.getOuserpwd()+"  "+o.getOrealname()+"  "+o.getOsex()+"  "+o.getOisadmin());
		}
	}

	//@Test
	public void testGetTotalPages() {
		int totalpages = iod.getOperatorTotalPages(400);
		assertEquals(totalpages, 1);
	}
	
	//@Test
	public void testGetOperatorById() {
		Operators o = iod.getOperatorById(1);
		System.out.println(o.getOperatorid()+"  "+o.getOrealname()+"  "+o.getOusername()+"  "+o.getOsex()+"  "+o.getOuserpwd()+"  "+o.getOisadmin());
	}
		
	//@Test
	public void testAddOperator() {
		Operators o = new Operators();
		o.setOusername("123");
		o.setOrealname("·³·³·³");
		o.setOsex("1");
		o.setOuserpwd("1");
		o.setOisadmin("1");
		
		assertTrue(iod.addOperator(o));
	}
		
	//@Test
	public void testModifyOperator() {
		Operators o = new Operators();
		o.setOusername("12311");
		o.setOrealname("·³·³·³111");
		o.setOsex("1");
		o.setOuserpwd("1");
		o.setOisadmin("1");	
		o.setOperatorid(6);
		
		assertTrue(iod.modifyOperator(o));
	}
	
	//@Test
	public void testDeleteOperator(){
		try{
			int operatorid = 6 ;
			if(!iod.deleteOperator(operatorid)){
				System.out.println("²Ù×÷Ô±É¾³ýÊ§°Ü£¬²Ù×÷Ô±¶ÔÏóÎª¿Õ/²Ù×÷Ô±±àºÅ´«Êä³ö´í!");
			}
		}catch(NumberFormatException e){
			System.out.println("²Ù×÷Ô±É¾³ýÊ§°Ü£¬±àºÅÒì³£");
		}
	}
}
