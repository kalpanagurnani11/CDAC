package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyAddServlet extends HttpServlet {
	
	private String msg;
	private int val;
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		 msg=config.getInitParameter("greet");
		 val=Integer.parseInt(config.getInitParameter("value"));
		System.out.println("in init method");
	}
	public void destroy() {
		System.out.println("in destroy method");
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int num1=Integer.parseInt(req.getParameter("num1"));
		int num2=Integer.parseInt(req.getParameter("num2"));
		out.println("Addition:"+(num1+num2));
		out.println(msg);
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
	

}
