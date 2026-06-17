package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ResetPasswordServlet extends HttpServlet {
	
	private int val;
	
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		val=Integer.parseInt(config.getInitParameter("code"));
		
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String uname=req.getParameter("uname");
		String pswd=req.getParameter("newpass");
		String retype=req.getParameter("retype");
		int code=Integer.parseInt(req.getParameter("code"));
		if(code==val)
		{     
			out.println("<h1> password reset successfully<h1>");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}
		
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		doGet(req,res);
	}

	

}
