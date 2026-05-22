package com.demo.servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.demo.model.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;





@WebServlet("/display")
public class DisplayProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ProductService pservice=new ProductServiceImpl();
			List<Product> plist=pservice.getAll();
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<h1>Product tdetails</h1>");
			out.println("<table border='2'><tr><th>Product_Id</th><thProduct_>Name</th><th>Quantity</th><th>Price</th><th>Mfg_Date</th><th>Action</th></tr>");
			for(Product p:plist) {
				if(p.getMfgdate()!=null) {
				    out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td><td>"+p.getMfgdate().toString()+"</td>");
				}else {
					 out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getQty()+"</td><td>"+p.getPrice()+"</td><td></td>");
				}
				out.println("<td><a href='editproduct?pid="+p.getPid()+"'>edit</a> / <a href='#'>delete</a></td></tr>");
			}
			out.println("</table>");
			out.println("<a href='addproduct.html'>Add new Product</a>");
			
		}

	
	
		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
