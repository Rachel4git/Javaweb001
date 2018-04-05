package com.atrachel.javaweb; /**
 * Created by hd48552 on 2018/4/5.
 */

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;
public class TestDemo1  implements  Servlet{
//构造器
    public  TestDemo1(){
        System.out.println("--------i am TestDemo1's constructor--------");

    }
//init方法
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("--------init--------");
        //servletconfig的getInitParameter方法
        String ss = servletConfig.getInitParameter("username");
        System.out.println("username="+ ss);
        //servletconfig的getServletContext方法
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println("servletContext= " + servletContext);
        //servletconfig的getServletName方法
        String servletname = servletConfig.getServletName();
        System.out.println("servletname ="+servletname);
        //servletcontext的getInitParameter方法
        String appname = servletContext.getInitParameter("appname");
        System.out.println("appname="+appname);
        String apppassword = servletContext.getInitParameter("app-password");
        System.out.println("app-password="+apppassword);
        //servletconfig的getRealPath方法
        String realpath = servletContext.getRealPath("TestDemo1");
        System.out.println("realpath="+realpath);
        //servletconfig的getContextPath方法
        String ContextPath = servletContext.getContextPath();
        System.out.println("ContextPath="+ContextPath);

    }


    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
//service方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("--------service--------");
        //ServletRequest的getParameter方法
        String getuser = servletRequest.getParameter("user");
        String getpassword = servletRequest.getParameter("password") ;
        System.out.println("getuser="+getuser);
        System.out.println("getpassword="+getpassword);
        //httpServletRequest的方法
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String URL = httpServletRequest.getRequestURI();
        String method = httpServletRequest.getMethod();
        String querystring = httpServletRequest.getQueryString();
        String servletpath = httpServletRequest.getServletPath();
        System.out.println("URL="+URL);
        System.out.println("method="+method);
        System.out.println("querystring="+querystring);
        System.out.println("servletpath="+servletpath);

         System.out.println("-------------------");
         servletResponse .getWriter().print("submit success");
    }


    @Override
    public String getServletInfo() {
        return null;
    }
//destroy方法
    @Override
    public void destroy() {
        System.out.print("--------destroy--------");
    }
}