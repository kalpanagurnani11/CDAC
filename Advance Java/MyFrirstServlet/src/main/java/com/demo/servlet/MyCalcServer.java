package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyCalcServer extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		int num1=Integer.parseInt(req.getParameter("num1"));
		String btn=req.getParameter("btn");
		if(btn.equals("sub"))
		{
			int num2=Integer.parseInt(req.getParameter("num2"));	
			out.println("Sub:"+(num1-num2));
			
		}
		else
		{
			int f=factorial(num1);
			out.println("factorial:"+f);
		}
		
		
		
	}
	private int factorial(int num1) {
		// TODO Auto-generated method stub
		int f=1;
		for(int i=1;i<=num1;i++)
		{
			f=f*i;
		}
		return f;
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		doGet(req,res);
	}
	
}
