/**
 * 
 */
package com.booksys.operator.dao;

import java.util.List;

import com.booksys.po.Operators;


/**
 * @author Administrator
 *
 */
public interface IOperatorDAO {
	
	/**
	 * 登录验证 
	 * @param o 用户名和密码
	 * @return 用户名密码是否正确
	 */
	public Operators checkLogin(Operators o);
	
	/**
	 * 判断用户名是否可用
	 * @param ousername 用户名
	 * @return 是否可用
	 */
	public boolean checkUsername(String ousername);
	
	/**
	 * 分页显示操作员信息
	 * @param pages 当前页
	 * @param pagesize 每页显示行数
	 * @return Operators集合
	 */
	public List<Operators> getOperators(int pages,int pagesize);
	
	/**
	 * 获取总页数
	 * @param pagesize 每页显示行数
	 * @return 总页数
	 */
	public int getOperatorTotalPages(int pagesize);
	
	/***
	 * 根据操作员编号显示操作员信息
	 * @param operatorid 操作员编号
	 * @return 
	 */
	public Operators getOperatorById(int operatorid);
	
	/**
	 * 添加操作员信息
	 * @param o
	 * @return 是否添加成功
	 */
	public boolean addOperator(Operators o);
	
	/**
	 * 修改操作员信息
	 * @param o 操作员基本信息
	 * @return 是否修改成功
	 */
	public boolean modifyOperator(Operators o);
	
	/**
	 * 删除操作员
	 * @param operatorid 操作员编号
	 * @return 是否删除成功
	 */
	public boolean deleteOperator(int operatorid);
}
