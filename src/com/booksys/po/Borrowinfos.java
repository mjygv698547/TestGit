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
public class Borrowinfos implements Serializable {
	private Integer borrowinfosid;
	public Integer getBorrowinfosid() {
		return borrowinfosid;
	}
	public void setBorrowinfosid(Integer borrowinfosid) {
		this.borrowinfosid = borrowinfosid;
	}
	
	private Integer readerid ;
	private Integer bookid ;
	private Date borrowdate;
	private Date lastdate;
	private Date returndate;
	private Integer reborrowtime;
	private Date orderdate;
	private Books books;
	private Readers readers;
	
	private Integer restborrowday;
	private Integer reborrowday;
	private Integer maxreborrowtime;
	private Integer orderrestday;
	
	public Integer getRestborrowday() {
		return restborrowday;
	}
	public void setRestborrowday(Integer restborrowday) {
		this.restborrowday = restborrowday;
	}
	public Integer getReborrowday() {
		return reborrowday;
	}
	public void setReborrowday(Integer reborrowday) {
		this.reborrowday = reborrowday;
	}
	public Integer getMaxreborrowtime() {
		return maxreborrowtime;
	}
	public void setMaxreborrowtime(Integer maxreborrowtime) {
		this.maxreborrowtime = maxreborrowtime;
	}
	public Integer getOrderrestday() {
		return orderrestday;
	}
	public void setOrderrestday(Integer orderrestday) {
		this.orderrestday = orderrestday;
	}
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	public Readers getReaders() {
		return readers;
	}
	public void setReaders(Readers readers) {
		this.readers = readers;
	}
	/**
	 * 
	 */
	public Borrowinfos() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the readerid
	 */
	public Integer getReaderid() {
		return readerid;
	}
	/**
	 * @param readerid the readerid to set
	 */
	public void setReaderid(Integer readerid) {
		this.readerid = readerid;
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
	 * @return the borrowdate
	 */
	public Date getBorrowdate() {
		return borrowdate;
	}
	/**
	 * @param borrowdate the borrowdate to set
	 */
	public void setBorrowdate(Date borrowdate) {
		this.borrowdate = borrowdate;
	}
	/**
	 * @return the lastdate
	 */
	public Date getLastdate() {
		return lastdate;
	}
	/**
	 * @param lastdate the lastdate to set
	 */
	public void setLastdate(Date lastdate) {
		this.lastdate = lastdate;
	}
	/**
	 * @return the returndate
	 */
	public Date getReturndate() {
		return returndate;
	}
	/**
	 * @param returndate the returndate to set
	 */
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	/**
	 * @return the reborrowtime
	 */
	public Integer getReborrowtime() {
		return reborrowtime;
	}
	/**
	 * @param reborrowtime the reborrowtime to set
	 */
	public void setReborrowtime(Integer reborrowtime) {
		this.reborrowtime = reborrowtime;
	}
	/**
	 * @return the orderdate
	 */
	public Date getOrderdate() {
		return orderdate;
	}
	/**
	 * @param orderdate the orderdate to set
	 */
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

}
