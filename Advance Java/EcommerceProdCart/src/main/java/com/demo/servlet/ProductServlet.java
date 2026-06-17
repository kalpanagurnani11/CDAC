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

import com.demo.model.MyUser;
import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/addproduct")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		MyUser u=(MyUser)session.getAttribute("user");
		if(u!=null) {
			String btn=request.getParameter("btn");
			if(btn.equals("add"))
			{
				int catid=Integer.parseInt(request.getParameter("catid"));
				ProductService pservice=new ProductServiceImpl();
				List<Product>plist=pservice.getAllProduct(catid);
				request.setAttribute("plist",plist);
				  RequestDispatcher rd = request.getRequestDispatcher("Product.jsp");
				  rd.forward(request, response);
				
				
			}
			
			
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
