/**
 * 
 */
package com.booksys.po;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class Booktypes implements Serializable {

	private Integer booktypeid ;
	private String booktypename ;
	private String  booktypelocation ;
	private Books book;
	
	/**
	 * 
	 */
	public Booktypes() {
		// TODO Auto-generated constructor stub
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
	 * @return the booktypename
	 */
	public String getBooktypename() {
		return booktypename;
	}
	/**
	 * @param booktypename the booktypename to set
	 */
	public void setBooktypename(String booktypename) {
		this.booktypename = booktypename;
	}
	/**
	 * @return the booktypelocation
	 */
	public String getBooktypelocation() {
		return booktypelocation;
	}
	/**
	 * @param booktypelocation the booktypelocation to set
	 */
	public void setBooktypelocation(String booktypelocation) {
		this.booktypelocation = booktypelocation;
	}
	/**
	 * @return the book
	 */
	public Books getBook() {
		return book;
	}
	/**
	 * @param book the book to set
	 */
	public void setBook(Books book) {
		this.book = book;
	}

}
