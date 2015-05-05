/**
 * 
 */
package com.booksys.operator.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.booksys.operator.dao.IOperatorDAO;
import com.booksys.po.Operators;

/**
 * @author Administrator
 * 
 */
public class OperatorLoginAction implements ServletRequestAware {
    private HttpServletRequest request;
    private HttpSession session;

    private Operators o;

    /**
	 * 
	 */
    public OperatorLoginAction() {
        // TODO Auto-generated constructor stub
    }

    public void setServletRequest(HttpServletRequest arg0) {
        // TODO Auto-generated method stub
        request = arg0;
        session = request.getSession();
    }

    /**
     * 登录处理的执行方法
     * 
     * @return Result Name
     */
    public String operatorLogin() {
        boolean flag = false;
        if ("".equals(o.getOusername().trim())) {
            request.setAttribute("ousername", "用户名不能为空");
            flag = true;
        }
        if ("".equals(o.getOuserpwd().trim())) {
            request.setAttribute("ouserpwd", "密码不能为空");
            flag = true;
        }
        if (flag) {
            return "required";
        }

        IOperatorDAO iod = (IOperatorDAO) request.getAttribute("ioperatordao");
        Operators op = iod.checkLogin(o);
        if (op != null) {
            session.setAttribute("operator", op);
            String i = op.getOisadmin();
            String isadmin = null;
            System.out.println(i);
            if (i.equals("1")) {
                isadmin = "管理员";
                System.out.println("here");
            }
            session.setAttribute("isadmin", isadmin);
            return "success";
        } else {
            request.setAttribute("error", "用户名或密码错误");
            return "error";
        }
    }

    /**
     * @return the o
     */
    public Operators getO() {
        return o;
    }

    /**
     * @param o
     *            the o to set
     */
    public void setO(Operators o) {
        this.o = o;
    }

}
