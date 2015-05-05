/**
 * 
 */
package com.booksys.notice.dao;

import java.util.List;

import com.booksys.po.Notices;

/**
 * @author Administrator
 *
 */
public interface INoticeDAO {
	
	/**
	 * ��ӹ�����Ϣ
	 * @param n ���������Ϣ
	 * @return  �Ƿ���ӳɹ�
	 */
	public boolean addNotice(Notices n);
	/**
	 * ��ҳ��ʾ������Ϣ
	 * @param pages ��ǰҳ
	 * @param pagesize ÿҳ��ʾ����
	 * @return Notices����
	 */
	public List<Notices> getNotices(int pages,int pagesize);
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
	public Notices getNoticeById(int noticeid);
	
	/**
	 * �޸Ĺ�����Ϣ
	 * @param n ���������Ϣ
	 * @return �Ƿ��޸ĳɹ�
	 */
	public boolean updateNotice(Notices n);
	
	public int deleteNotice(int Noticeid);
	
	public boolean editNotice(Notices n);
	
}

