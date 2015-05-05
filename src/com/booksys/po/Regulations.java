/**
 * 
 */
package com.booksys.po;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class Regulations implements Serializable {
	private Integer regulationid;
	private String regulationname;
	private Integer restborrowday;
	private Integer reborrowday;
	private Integer maxreborrowtime;
	private Integer orderrestday;
	
	/**
	 * 
	 */
	public Regulations() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the regulationid
	 */
	public Integer getRegulationid() {
		return regulationid;
	}

	/**
	 * @param regulationid the regulationid to set
	 */
	public void setRegulationid(Integer regulationid) {
		this.regulationid = regulationid;
	}

	/**
	 * @return the regulationname
	 */
	public String getRegulationname() {
		return regulationname;
	}

	/**
	 * @param regulationname the regulationname to set
	 */
	public void setRegulationname(String regulationname) {
		this.regulationname = regulationname;
	}

	/**
	 * @return the restborrowday
	 */
	public Integer getRestborrowday() {
		return restborrowday;
	}

	/**
	 * @param restborrowday the restborrowday to set
	 */
	public void setRestborrowday(Integer restborrowday) {
		this.restborrowday = restborrowday;
	}

	/**
	 * @return the reborrowday
	 */
	public Integer getReborrowday() {
		return reborrowday;
	}

	/**
	 * @param reborrowday the reborrowday to set
	 */
	public void setReborrowday(Integer reborrowday) {
		this.reborrowday = reborrowday;
	}

	/**
	 * @return the maxreborrowtime
	 */
	public Integer getMaxreborrowtime() {
		return maxreborrowtime;
	}

	/**
	 * @param maxreborrowtime the maxreborrowtime to set
	 */
	public void setMaxreborrowtime(Integer maxreborrowtime) {
		this.maxreborrowtime = maxreborrowtime;
	}

	/**
	 * @return the orderrestday
	 */
	public Integer getOrderrestday() {
		return orderrestday;
	}

	/**
	 * @param orderrestday the orderrestday to set
	 */
	public void setOrderrestday(Integer orderrestday) {
		this.orderrestday = orderrestday;
	}

}
