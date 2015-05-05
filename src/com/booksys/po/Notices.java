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
public class Notices implements Serializable {

	private Integer noticeid ;
	private String noticetitle ;
	private String noticecontent ;
	private Date noticedate ;
	private String noticeperson ;
	private Date lastmodifytime ;
	/**
	 * 
	 */
	public Notices() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the noticeid
	 */
	public Integer getNoticeid() {
		return noticeid;
	}
	/**
	 * @param noticeid the noticeid to set
	 */
	public void setNoticeid(Integer noticeid) {
		this.noticeid = noticeid;
	}
	/**
	 * @return the noticetitle
	 */
	public String getNoticetitle() {
		return noticetitle;
	}
	/**
	 * @param noticetitle the noticetitle to set
	 */
	public void setNoticetitle(String noticetitle) {
		this.noticetitle = noticetitle;
	}
	/**
	 * @return the noticecontent
	 */
	public String getNoticecontent() {
		return noticecontent;
	}
	/**
	 * @param noticecontent the noticecontent to set
	 */
	public void setNoticecontent(String noticecontent) {
		this.noticecontent = noticecontent;
	}
	/**
	 * @return the noticedate
	 */
	public Date getNoticedate() {
		return noticedate;
	}
	/**
	 * @param noticedate the noticedate to set
	 */
	public void setNoticedate(Date noticedate) {
		this.noticedate = noticedate;
	}
	/**
	 * @return the noticeperson
	 */
	public String getNoticeperson() {
		return noticeperson;
	}
	/**
	 * @param noticeperson the noticeperson to set
	 */
	public void setNoticeperson(String noticeperson) {
		this.noticeperson = noticeperson;
	}
	/**
	 * @return the lastmodifytime
	 */
	public Date getLastmodifytime() {
		return lastmodifytime;
	}
	/**
	 * @param lastmodifytime the lastmodifytime to set
	 */
	public void setLastmodifytime(Date lastmodifytime) {
		this.lastmodifytime = lastmodifytime;
	}

}
