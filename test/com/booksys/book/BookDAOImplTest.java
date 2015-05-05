package com.booksys.book;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.booksys.book.dao.BookDAOImpl;
import com.booksys.book.dao.IBookDAO;
import com.booksys.po.Books;
import com.booksys.po.Booktypes;

public class BookDAOImplTest {

	private IBookDAO ibd;
	@Before
	public void setUp() throws Exception {
		ibd = new BookDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		ibd = null;
	}

	//@Test
	public void testGetBooks() {
		List<Books> list = ibd.getBooks(2, 10);
		for(Books b : list){
			System.out.println(b.getBookid()+"  "+b.getBookname()+"  "+b.getBookauthor()+"  "+b.getBookisbn()+"  "+b.getBookpublish()+"  "+b.getBookpublishdate()+"  "+b.getBookprice()+"  "+b.getBookindate()+"  "+b.getBookcode()+"  "+b.getBookstate()+"  "+b.getBooktypeid());
		}
	}

	//@Test
	public void testGetBookTotalPages() {
		int totalpages = ibd.getBookTotalPages(1);
		assertEquals(totalpages, 1);
	}
	
	//@Test
	public void testGetBookById() {
		Books b = ibd.getBookById(1);
		System.out.println(b.getBookid()+"  "+b.getBookname()+"  "+b.getBookauthor()+"  "+b.getBookisbn()+"  "+b.getBookpublish()+"  "+b.getBookpublishdate()+"  "+b.getBookprice()+"  "+b.getBookindate()+"  "+b.getBookcode()+"  "+b.getBookstate()+"  "+b.getBooktypeid());
	}
	
	//@Test
	public void testAddBook() {
		Books b = new Books();
		b.setBookname("123");
		b.setBookauthor("烦烦烦");
		b.setBookisbn("isbn 543");
		b.setBookpublish("1");
		b.setBookpublishdate(Date.valueOf("2012-06-24"));
		b.setBookprice(52.00);
		b.setBookindate(Date.valueOf("2012-06-25"));
		b.setBookcode("a5423154");
		b.setBookstate(1);
		b.setBooktypeid(1);
		
		assertTrue(ibd.addBook(b));
	}
	
	//@Test
	public void testModifyBook() {
		Books b = new Books();
		b.setBookname("123");
		b.setBookauthor("烦烦烦");
		b.setBookisbn("isbn 543");
		b.setBookpublish("1");
		b.setBookpublishdate(Date.valueOf("2012-06-24"));
		b.setBookprice(52.00);
		b.setBookindate(Date.valueOf("2012-06-25"));
		b.setBookcode("a5423154");		
		b.setBookid(14);
		
		assertTrue(ibd.modifyBook(b));
	}
	
	//@Test
	public void testDeleteBook(){
		try{
			int bookid = 1 ;
			if(!ibd.deleteBook(bookid)){
				System.out.println("图书删除失败，该图书已经借出不能删除!");
			}
		}catch(NumberFormatException e){
			System.out.println("图书删除失败，编号异常");
		}
	}
	
	//@Test
	public void testGetBookByName() {
		List<Books> list = ibd.getBooksByBookName("应试英语语法");
		for(Books b : list){
			System.out.println(b.getBookid()+"  "+b.getBookname()+"  "+b.getBookauthor()+"  "+b.getBookisbn()+"  "+b.getBookpublish()+"  "+b.getBookpublishdate()+"  "+b.getBookprice()+"  "+b.getBookindate()+"  "+b.getBookcode()+"  "+b.getBookstate()+"  "+b.getBooktypeid());
		}
	}
	
	//@Test
	public void testGetBookByCode() {
		List<Books> list = ibd.getBooksByBookCode("55-66-77");
		for(Books b : list){
			System.out.println(b.getBookid()+"  "+b.getBookname()+"  "+b.getBookauthor()+"  "+b.getBookisbn()+"  "+b.getBookpublish()+"  "+b.getBookpublishdate()+"  "+b.getBookprice()+"  "+b.getBookindate()+"  "+b.getBookcode()+"  "+b.getBookstate()+"  "+b.getBooktypeid());
		}
	}
	
	@Test
	public void testgetbookbycodexdj(){
		Books b = ibd.getBooksByBookCodexdj("55-66-77");
		System.out.println(b.getBookid()+"  "+b.getBookname()+"  "+b.getBookauthor()+"  "+b.getBookisbn()+"  "+b.getBookpublish()+"  "+b.getBookpublishdate()+"  "+b.getBookprice()+"  "+b.getBookindate()+"  "+b.getBookcode()+"  "+b.getBookstate()+"  "+b.getBooktypeid());
	}
	
	//@Test
	public void testGetBookByIsbn() {
		List<Books> list = ibd.getBooksByBookIsbn("isbn55-66-77");
		for(Books b : list){
			System.out.println(b.getBookid()+"  "+b.getBookname()+"  "+b.getBookauthor()+"  "+b.getBookisbn()+"  "+b.getBookpublish()+"  "+b.getBookpublishdate()+"  "+b.getBookprice()+"  "+b.getBookindate()+"  "+b.getBookcode()+"  "+b.getBookstate()+"  "+b.getBooktypeid());
		}
	}
	
	//@Test
	public void testAddBooktype() {
		Booktypes bt = new Booktypes();
		bt.setBooktypename("丰富了哦");
		bt.setBooktypelocation("A123");
		
		assertTrue(ibd.addBooktype(bt));
	}
	
	//@Test
	public void testModifyBooktype() {
		Booktypes bt = new Booktypes();
		bt.setBooktypename("神射");
		bt.setBooktypelocation("A777");	
		bt.setBooktypeid(5);
		
		assertTrue(ibd.modifyBooktype(bt));
	}
	
	//@Test
	public void testDeleteBooktype(){
		try{
			int booktypeid = 10 ;
			if(!ibd.deleteBooktype(booktypeid)){
				System.out.println("图书类别删除失败，类别编号异常!");
			}
		}catch(Exception e){
			System.out.println("图书类别删除失败，该图书类别已经被图书引用,不能删除!");
		}
	}
	
	//@Test
	public void testGetBooktypes() {
		List<Booktypes> list = ibd.getBooktypes(2, 2);
		for(Booktypes bt : list){
			System.out.println(bt.getBooktypeid()+"  "+bt.getBooktypename()+"  "+bt.getBooktypelocation());
		}
	}

	//@Test
	public void testGetBooktypeTotalPages() {
		int totalpages = ibd.getBooktypeTotalPages(1000);
		assertEquals(totalpages, 1);
	}
	
	//@Test
	public void testGetBooktypeById() {
		Booktypes bt = ibd.getBooktypeById(1);
		System.out.println(bt.getBooktypeid()+"  "+bt.getBooktypename()+"  "+bt.getBooktypelocation());
	}
	
	//@Test
	public void testGetBooksByBooktypeid(){
		Books b = new Books();
		b.setBooktypeid(1);
		
		List<Books> list = ibd.getBooksByBooktypeid(b);
		
		for(Books bs : list){
			//System.out.println(bs.getBooktype());
			//System.out.println(bs.getBooktype().getBooktypename());
			System.out.println(bs.getBookname()+"  "+bs.getBookauthor()+"  "+bs.getBookpublish()+"  "+bs.getBooktype().getBooktypename());
		}
	}
	
	//@Test
	public void testGetBooktypesreader(){
		List<Booktypes> list = ibd.getBooktypes();
		assertEquals(list.size(), 5);
		for(Booktypes bt : list){
			System.out.println(bt.getBooktypeid()+"  "+bt.getBooktypename()+"  "+bt.getBooktypelocation());
		}
	}
	
	//@Test
	public void testGetBooksByBooknameBookcodeBookisbn(){
		Books b = new Books();
		b.setBookname("操作系统");	
		b.setBookcode("");	
		b.setBookisbn("sbn11-22-33");
		List<Books> list = ibd.getBooksBybooknamebookcodebookisbn(b);		
		for(Books bs : list){
			//System.out.println(bs.getBooktype());
			//System.out.println(bs.getBooktype().getBooktypename());
			System.out.println(bs.getBookname()+"  "+bs.getBookcode()+"  "+bs.getBookpublish()+"  "+bs.getBookstate());
		}
	}
	
	//@Test
	public void testGetBooksbybooktyid() {
		Booktypes bt = new Booktypes();
		bt.setBooktypeid(1);
		//System.out.println(bs.getBooktypeid());
		List<Books> list = ibd.getBooksbybooktypeid(2, 2,bt.getBooktypeid());
		//System.out.println(list);
		for(Books b : list){
			//System.out.println(b);
			System.out.println(b.getBookid()+"  "+b.getBookname()+"  "+b.getBookauthor()+"  "+b.getBookisbn()+"  "+b.getBookpublish()+"  "+b.getBookpublishdate()+"  "+b.getBookprice()+"  "+b.getBookindate()+"  "+b.getBookcode()+"  "+b.getBookstate()+"  "+b.getBooktypeid());
		}
	}

	//@Test
	public void testGetBookTotalPagesbybooktypeid() {
		int totalpages = ibd.getBookTotalPagesbybooktypeid(100,2);
		assertEquals(totalpages, 1);
	}
	
	//@Test
	public void testGetBookinfos(){
		Books bs = new Books();
		bs = ibd.getBookinfos(2);
		System.out.println(bs.getBookid()+"  "+bs.getBookname()+"  "+bs.getBookauthor()+"  "+bs.getBookisbn()+"  "+bs.getBookpublish()+"  "+bs.getBookpublishdate()+"  "+bs.getBookprice()+"  "+bs.getBookindate()+"  "+bs.getBookcode()+"  "+bs.getBookstate()+"  "+bs.getBooktype().getBooktypename()+"  "+bs.getBooktype().getBooktypelocation());
	}
	
	//@Test
	public void testGetBookinfos1(){
		Books bs = new Books();
		bs = ibd.getBookinfos(2);
		System.out.println(bs.getBookid()+"  "+bs.getBookname()+"  "+bs.getBookauthor()+"  "+bs.getBookisbn()+"  "+bs.getBookpublish()+"  "+bs.getBookpublishdate()+"  "+bs.getBookprice()+"  "+bs.getBookindate()+"  "+bs.getBookcode()+"  "+bs.getBookstate()+"  "+bs.getBooktype().getBooktypename()+"  "+bs.getBooktype().getBooktypelocation());
	}
	
	//@Test
	public void testGetBooksByBooknameBookisbnBookpublishBookstate(){
		Books b = new Books();
		b.setBookname("操作系统");	
		b.setBookisbn("sbn11-22-33");
		b.setBookpublish("");
		b.setBookauthor("");
		List<Books> list = ibd.getBooksBybooknamebookisbnbookpublishbookauthor(b);		
		for(Books bs : list){
			//System.out.println(bs.getBooktype());
			//System.out.println(bs.getBooktype().getBooktypename());
			System.out.println(bs.getBookname()+"  "+bs.getBookcode()+"  "+bs.getBookpublish()+"  "+bs.getBookstate());
		}
	}
}
