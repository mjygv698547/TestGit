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
	 * ��ӹ�����Ϣ
	 * @param n ���������Ϣ
	 * @return  �Ƿ���ӳɹ�
	 */
	public boolean addRegulation(Regulations n);
	/**
	 * ��ҳ��ʾ������Ϣ
	 * @param pages ��ǰҳ
	 * @param pagesize ÿҳ��ʾ����
	 * @return Notices����
	 */
	public List<Regulations> getRegulations(int pages,int pagesize);
	/**
	 * ��ȡ��ҳ��
	 * @param pagesize ÿҳ��ʾ����
	 * @return ��ҳ��
	 */
	public int getTotalPages(int pagesize);
	/**
	 * ���ݹ�������ʾ������Ϣ
	 * @param noticeid ������
	 * @return Notices
	 */
	public Regulations getRegulationById(int Regulationid);
	
	/**
	 * �޸Ĺ�����Ϣ
	 * @param n ���������Ϣ
	 * @return �Ƿ��޸ĳɹ�
	 */
	public boolean updateRegulation(Regulations n);
	
	public int deleteRegulation(int Regulationid);
	
	public boolean editRegulation(Regulations n);
	
}
