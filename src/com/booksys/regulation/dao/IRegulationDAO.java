/**
 * 
 */
package com.booksys.regulation.dao;

import java.util.List;

import com.booksys.po.Regulations;

/**
 * @author Administrator
 *
 */
public interface IRegulationDAO {

	/**
	 * 添加公告信息
	 * @param n 公告基本信息
	 * @return  是否添加成功
	 */
	public boolean addRegulation(Regulations n);
	/**
	 * 分页显示公告信息
	 * @param pages 当前页
	 * @param pagesize 每页显示行数
	 * @return Notices集合
	 */
	public List<Regulations> getRegulations(int pages,int pagesize);
	/**
	 * 获取总页数
	 * @param pagesize 每页显示行数
	 * @return 总页数
	 */
	public int getTotalPages(int pagesize);
	/**
	 * 根据公告编号显示公告信息
	 * @param noticeid 公告编号
	 * @return Notices
	 */
	public Regulations getRegulationById(int Regulationid);
	
	/**
	 * 修改公告信息
	 * @param n 公告基本信息
	 * @return 是否修改成功
	 */
	public boolean updateRegulation(Regulations n);
	
	public int deleteRegulation(int Regulationid);
	
	public boolean editRegulation(Regulations n);
	
}
