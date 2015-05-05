/**
 * 
 */
package com.booksys.po;

import java.io.Serializable;
import java.sql.Date;

/**
 * @author Administrator
 *
 */
public class Books implements Serializable {
	private Integer bookid ;
	private String bookname;
	private String bookauthor ;
	private String  bookisbn ;
	private String  bookpublish ;
	private Date  bookpublishdate ;
	private Double  bookprice ;
	private Date  bookindate;
	private String  bookcode ;
	private Integer  bookstate ;
	private Integer  booktypeid ;
	
	private Booktypes booktype;
	
	/**
	 * 
	 */
	public Books() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the bookid
	 */
	public Integer getBookid() {
		return bookid;
	}

	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	/**
	 * @return the bookname
	 */
	public String getBookname() {
		return bookname;
	}

	/**
	 * @param bookname the bookname to set
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	/**
	 * @return the bookauthor
	 */
	public String getBookauthor() {
		return bookauthor;
	}

	/**
	 * @param bookauthor the bookauthor to set
	 */
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	/**
	 * @return the bookisbn
	 */
	public String getBookisbn() {
		return bookisbn;
	}

	/**
	 * @param bookisbn the bookisbn to set
	 */
	public void setBookisbn(String bookisbn) {
		this.bookisbn = bookisbn;
	}

	/**
	 * @return the bookpublish
	 */
	public String getBookpublish() {
		return bookpublish;
	}

	/**
	 * @param bookpublish the bookpublish to set
	 */
	public void setBookpublish(String bookpublish) {
		this.bookpublish = bookpublish;
	}

	/**
	 * @return the bookpublishdate
	 */
	public Date getBookpublishdate() {
		return bookpublishdate;
	}

	/**
	 * @param bookpublishdate the bookpublishdate to set
	 */
	public void setBookpublishdate(Date bookpublishdate) {
		this.bookpublishdate = bookpublishdate;
	}

	/**
	 * @return the bookprice
	 */
	public Double getBookprice() {
		return bookprice;
	}

	/**
	 * @param bookprice the bookprice to set
	 */
	public void setBookprice(Double bookprice) {
		this.bookprice = bookprice;
	}

	/**
	 * @return the bookindate
	 */
	public Date getBookindate() {
		return bookindate;
	}

	/**
	 * @param bookindate the bookindate to set
	 */
	public void setBookindate(Date bookindate) {
		this.bookindate = bookindate;
	}

	/**
	 * @return the bookcode
	 */
	public String getBookcode() {
		return bookcode;
	}

	/**
	 * @param bookcode the bookcode to set
	 */
	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}

	/**
	 * @return the bookstate
	 */
	public Integer getBookstate() {
		return bookstate;
	}

	/**
	 * @param bookstate the bookstate to set
	 */
	public void setBookstate(Integer bookstate) {
		this.bookstate = bookstate;
	}

	/**
	 * @return the booktypeid
	 */
	public Integer getBooktypeid() {
		return booktypeid;
	}

	/**
	 * @param booktypeid the booktypeid to set
	 */
	public void setBooktypeid(Integer booktypeid) {
		this.booktypeid = booktypeid;
	}

	/**
	 * @return the booktype
	 */
	public Booktypes getBooktype() {
		return booktype;
	}

	/**
	 * @param booktype the booktype to set
	 */
	public void setBooktype(Booktypes booktype) {
		this.booktype = booktype;
	}

}
