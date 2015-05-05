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
public class Readers implements Serializable {
	private Integer readerid ;
	private String readername;
	private String  readeridcard ;
	private String  readerpwd ;
	private Date  createdate ;
	private Date effectivedate;
	private Date deaddate ;
	private Double cash ;
	private Integer telephone;
	private Integer regulationid ;
	private Regulations regulations;
	private String newpassword;
	
	
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public Regulations getRegulations() {
		return regulations;
	}
	public void setRegulations(Regulations regulations) {
		this.regulations = regulations;
	}
	/**
	 * 
	 */
	public Readers() {
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
	 * @return the readername
	 */
	public String getReadername() {
		return readername;
	}
	/**
	 * @param readername the readername to set
	 */
	public void setReadername(String readername) {
		this.readername = readername;
	}
	/**
	 * @return the readeridcard
	 */
	public String getReaderidcard() {
		return readeridcard;
	}
	/**
	 * @param readeridcard the readeridcard to set
	 */
	public void setReaderidcard(String readeridcard) {
		this.readeridcard = readeridcard;
	}
	/**
	 * @return the readerpwd
	 */
	public String getReaderpwd() {
		return readerpwd;
	}
	/**
	 * @param readerpwd the readerpwd to set
	 */
	public void setReaderpwd(String readerpwd) {
		this.readerpwd = readerpwd;
	}
	/**
	 * @return the createdate
	 */
	public Date getCreatedate() {
		return createdate;
	}
	/**
	 * @param createdate the createdate to set
	 */
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	/**
	 * @return the effectivedate
	 */
	public Date getEffectivedate() {
		return effectivedate;
	}
	/**
	 * @param effectivedate the effectivedate to set
	 */
	public void setEffectivedate(Date effectivedate) {
		this.effectivedate = effectivedate;
	}
	/**
	 * @return the deaddate
	 */
	public Date getDeaddate() {
		return deaddate;
	}
	/**
	 * @param deaddate the deaddate to set
	 */
	public void setDeaddate(Date deaddate) {
		this.deaddate = deaddate;
	}
	/**
	 * @return the cash
	 */
	public Double getCash() {
		return cash;
	}
	/**
	 * @param cash the cash to set
	 */
	public void setCash(Double cash) {
		this.cash = cash;
	}
	/**
	 * @return the telephone
	 */
	public Integer getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
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

}
