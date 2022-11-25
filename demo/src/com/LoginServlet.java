package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    Vector<Users> users = new Vector<Users>() ;		//存多个用户注册信息
    public LoginServlet() {
        super();
    }
    public void destroy() {
        super.destroy();
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response) ;
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getHeader("Referer").equals("http://localhost:8080/demo_war_exploded/register.jsp"))	//请求来源是注册
            register(request, response) ;	//注册函数
        else if(request.getHeader("Referer").equals("http://localhost:8080/demo_war_exploded/login.jsp")){	//请求来源是登录
            check(request, response) ;		//登录函数
        }
    }
    public void init() throws ServletException {
        super.init();
    }
    public void register(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8") ;		//注册前先设置编码格式
        String userName = request.getParameter("user") ;
        String password = request.getParameter("password") ;
        Users newUser = new Users(userName, password) ;		//创建新的用户信息
        users.add(newUser) ;			//将新用户添加进vector
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("<a href=\"login.jsp\">注册成功</a>");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
    public void check(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException  {
        request.setCharacterEncoding("UTF-8") ;		//登录前设置编码格式不然识别不出中文
        String nowUser = request.getParameter("user") ;
        String nowPassword = request.getParameter("password") ;
        Users check ;
        boolean flag = true ;		//记录是否匹配成功
        for(int i=0; i<users.size(); i++) {		//遍历整个注册信息
            check = users.get(i) ;
            if(nowUser.equals(check.getUserName()) && nowPassword.equals(check.getPassword())) {
                flag = false ;
                request.setAttribute("success", nowUser);	//向jsp页面传数据
                request.getRequestDispatcher("success.jsp").forward(request, response); //登录成功
                break ;
            }
        }
        if(flag)
            response.sendRedirect("failure.jsp") ;		//登录失败
        return ;
    }
}

