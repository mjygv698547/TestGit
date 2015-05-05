/**
 * 
 */
package com.booksys.po;

import java.io.Serializable;

/**
 * @author Administrator
 *
 */
public class Operators implements Serializable {

	private Integer  operatorid ;
	private String ousername ;
	private String ouserpwd ;
	private String  orealname ;
	private String   osex ;
	private String   oisadmin ;
	/**
	 * 
	 */
	public Operators() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the operatorid
	 */
	public Integer getOperatorid() {
		return operatorid;
	}
	/**
	 * @param operatorid the operatorid to set
	 */
	public void setOperatorid(Integer operatorid) {
		this.operatorid = operatorid;
	}
	/**
	 * @return the ousername
	 */
	public String getOusername() {
		return ousername;
	}
	/**
	 * @param ousername the ousername to set
	 */
	public void setOusername(String ousername) {
		this.ousername = ousername;
	}
	/**
	 * @return the ouserpwd
	 */
	public String getOuserpwd() {
		return ouserpwd;
	}
	/**
	 * @param ouserpwd the ouserpwd to set
	 */
	public void setOuserpwd(String ouserpwd) {
		this.ouserpwd = ouserpwd;
	}
	/**
	 * @return the orealname
	 */
	public String getOrealname() {
		return orealname;
	}
	/**
	 * @param orealname the orealname to set
	 */
	public void setOrealname(String orealname) {
		this.orealname = orealname;
	}
	/**
	 * @return the osex
	 */
	public String getOsex() {
		return osex;
	}
	/**
	 * @param osex the osex to set
	 */
	public void setOsex(String osex) {
		this.osex = osex;
	}
	/**
	 * @return the oisadmin
	 */
	public String getOisadmin() {
		return oisadmin;
	}
	/**
	 * @param oisadmin the oisadmin to set
	 */
	public void setOisadmin(String oisadmin) {
		this.oisadmin = oisadmin;
	}

}
