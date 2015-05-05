/**
 * 
 */
package com.booksys.reader.dao;

import java.sql.Date;
import java.util.List;

import com.booksys.po.Readers;
import com.booksys.po.Regulations;

/**
 * @author Administrator
 *
 */
public interface IReaderDAO {

	public Readers getregulationbyreaderid(Readers r);
	
	
	public  Readers readerlogin(Readers r);
//	public Date getdaterestborrowday(Readers r);
	
	
	public Readers getreaderxdj(int readerid);
	
	public boolean addreader(Readers r);
	
	
	public List<Readers> getreaderlist();
	
	
	public Readers getreaderbyreaderid(int readerid);
	
	public boolean updatereaderdeaddate(Readers r);
	
	public boolean deletereaderbyreaderid(int readerid);
	
	public boolean editReader(Readers r);
	
	public int turnreaderidcardtoreaderid(String readeridcard);
}
