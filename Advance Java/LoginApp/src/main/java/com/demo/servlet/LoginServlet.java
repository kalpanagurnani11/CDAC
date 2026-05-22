package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.model.MyUser;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String uname=req.getParameter("uname");
		String password=req.getParameter("pswd");
		
		LoginService lservice=new LoginServiceImpl();
		MyUser user=lservice.validateUser(uname,password);
		
		if(user!=null)
		{
			out.println("<h1>Welcome "+user.getRole());
			RequestDispatcher rd=req.getRequestDispatcher("display");
			  rd.forward(req, res);
		}
		else
		{
			out.println("invalid credentials");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);
		}
		
//		if(uname.equals("admin1")&& password.equals("admin1"))
//		{
//			out.println("<h1>you are admin<h1>");
//		}
//		else if(uname.equals("user1")&& password.equals("user1"))
//		{
//			out.print("<h1>Welcome<h1>"+uname);
//		}
//		else
//		{
//			out.println("<h1>Invalid Credentials plz reLogin</h1>");
//		RequestDispatcher rd=req.getRequestDispatcher("index.html");
//		rd.include(req, res);
//		}
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		doGet(req,res);
	}

}
