package com.demo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.demo.model.Category;
import com.demo.model.MyUser;
import com.demo.service.CategoryService;
import com.demo.service.CategoryServiceImpl;


@WebServlet("/category")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null)
		{
			CategoryService cservice=new CategoryServiceImpl();
			List<Category> clist=cservice.getAll();
			request.setAttribute("clist",clist);
		RequestDispatcher rd=request.getRequestDispatcher("Category.jsp");
		rd.forward(request, response);
	}
		else
		{
			out.println("plz login ");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);	
		}
		}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
