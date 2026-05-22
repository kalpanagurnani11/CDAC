package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String uname=req.getParameter("uname");
		String email=req.getParameter("email");
		String passwd=req.getParameter("pswd");
		out.println("<h1>You have successfully registered</h1>");
		RequestDispatcher rd=req.getRequestDispatcher("index.html");
		rd.include(req, res);

		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		doGet(req,res);
	}
	

}
