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
	 * ��¼��֤ 
	 * @param o �û���������
	 * @return �û��������Ƿ���ȷ
	 */
	public Operators checkLogin(Operators o);
	
	/**
	 * �ж��û����Ƿ����
	 * @param ousername �û���
	 * @return �Ƿ����
	 */
	public boolean checkUsername(String ousername);
	
	/**
	 * ��ҳ��ʾ����Ա��Ϣ
	 * @param pages ��ǰҳ
	 * @param pagesize ÿҳ��ʾ����
	 * @return Operators����
	 */
	public List<Operators> getOperators(int pages,int pagesize);
	
	/**
	 * ��ȡ��ҳ��
	 * @param pagesize ÿҳ��ʾ����
	 * @return ��ҳ��
	 */
	public int getOperatorTotalPages(int pagesize);
	
	/***
	 * ���ݲ���Ա�����ʾ����Ա��Ϣ
	 * @param operatorid ����Ա���
	 * @return 
	 */
	public Operators getOperatorById(int operatorid);
	
	/**
	 * ��Ӳ���Ա��Ϣ
	 * @param o
	 * @return �Ƿ���ӳɹ�
	 */
	public boolean addOperator(Operators o);
	
	/**
	 * �޸Ĳ���Ա��Ϣ
	 * @param o ����Ա������Ϣ
	 * @return �Ƿ��޸ĳɹ�
	 */
	public boolean modifyOperator(Operators o);
	
	/**
	 * ɾ������Ա
	 * @param operatorid ����Ա���
	 * @return �Ƿ�ɾ���ɹ�
	 */
	public boolean deleteOperator(int operatorid);
}
