/**
 * 
 */
package com.booksys.operator.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.booksys.po.Operators;
import com.booksys.util.MybatisSqlSessionFactory;

/**
 * @author Administrator
 * 
 */
public class OperatorDAOImpl implements IOperatorDAO {

    /**
	 * 
	 */
    public OperatorDAOImpl() {
        // TODO Auto-generated constructor stub
    }

    public Operators checkLogin(Operators o) {
        // TODO Auto-generated method stub
        SqlSession session = MybatisSqlSessionFactory.getSqlSession();
        Operators op = session.selectOne("checklogin", o);
        // System.out.println(op.getOrealname()+"  "+op.getOperatorid());
        MybatisSqlSessionFactory.closeSqlSession();
        return op;
    }

    public boolean checkUsername(String ousername) {
        // TODO Auto-generated method stub
        boolean result = true;
        SqlSession session = MybatisSqlSessionFactory.getSqlSession();
        Operators o = session.selectOne("checkusername", ousername);
        if (o != null) {
            result = false;
        }
        MybatisSqlSessionFactory.closeSqlSession();
        return result;
    }

    public List<Operators> getOperators(int pages, int pagesize) {
        // TODO Auto-generated method stub
        SqlSession session = MybatisSqlSessionFactory.getSqlSession();
        List<Operators> list = session
                .selectList("getoperators", null, new RowBounds((pages - 1) * pagesize, pagesize));
        MybatisSqlSessionFactory.closeSqlSession();
        return list;
    }

    public int getOperatorTotalPages(int pagesize) {
        // TODO Auto-generated method stub
        int totalpages = 0;
        SqlSession session = MybatisSqlSessionFactory.getSqlSession();
        Integer totalrecords = session.selectOne("getoperatortotalrecords");
        totalpages = (totalrecords % pagesize == 0 ? 0 : 1) + totalrecords / pagesize;
        MybatisSqlSessionFactory.closeSqlSession();
        return totalpages;
    }

    public Operators getOperatorById(int operatorid) {
        // TODO Auto-generated method stub
        Operators o = null;
        SqlSession session = MybatisSqlSessionFactory.getSqlSession();
        o = session.selectOne("getoperatorbyid", operatorid);
        return o;
    }

    public boolean addOperator(Operators o) {
        // TODO Auto-generated method stub
        boolean result = false;
        SqlSession session = MybatisSqlSessionFactory.getSqlSession();
        int i = session.insert("addoperators", o);
        if (i > 0) {
            session.commit();
            result = true;
            System.out.println("操作员添加成功!");
        } else {
            result = false;
            System.out.println("操作员添加失败!");
        }
        MybatisSqlSessionFactory.closeSqlSession();
        return result;
    }

    public boolean modifyOperator(Operators o) {
        // TODO Auto-generated method stub
        boolean result = false;
        SqlSession session = MybatisSqlSessionFactory.getSqlSession();
        int i = session.update("modifyoperators", o);
        if (i > 0) {
            session.commit();
            result = true;
            System.out.println("操作员修改成功!");
        } else {
            result = false;
            System.out.println("操作员修改失败!");
        }
        MybatisSqlSessionFactory.closeSqlSession();
        return result;
    }

    public boolean deleteOperator(int operatorid) {
        // TODO Auto-generated method stub
        boolean result = false;
        SqlSession session = MybatisSqlSessionFactory.getSqlSession();
        int i = session.delete("deleteoperators", operatorid);
        if (i > 0) {
            session.commit();
            result = true;
            System.out.println("操作员删除成功!");
        } else {
            result = false;
            System.out.println("操作员删除失败!");
        }
        return result;
    }

}
