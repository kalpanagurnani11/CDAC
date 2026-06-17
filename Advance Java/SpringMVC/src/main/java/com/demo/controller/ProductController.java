package com.demo.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.Product;
import com.demo.service.ProductService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/product")
public class ProductController {
     @Autowired
	ProductService pservice;
	
	@GetMapping("/viewProducts")
	public ModelAndView getAllProducts() {
		List<Product> plist=pservice.getAllProduct();
		return new ModelAndView("displayall","plist",plist);
	}
	@GetMapping("/insertProduct")
	public String addProductForm() {
		return "addproduct";
	}
	
	@PostMapping("/add")
	public ModelAndView insertProduct(@RequestParam("pid") int pid,@RequestParam("pnm") String pname,@RequestParam("qty") int qty,@RequestParam("pr") double price,@RequestParam("date") LocalDate mfgdate,@RequestParam("cid") int cid) {
		Product p=new Product(pid,pname,qty,price,mfgdate,cid);
		boolean status=pservice.addProduct(p);
		if(status)
		
			{
				return new ModelAndView("redirect:/product/viewProducts");
			}else {
				return new ModelAndView("addproduct","message","duplicate entry");
		
	}
	}
		
		

		@GetMapping("/editproduct/{pid}")
		public String showeditForm(@PathVariable("pid") int pid,Model model) {
			Product p=pservice.getProductById(pid);
			System.out.println(p);
			model.addAttribute("product",p);
			return "editProduct";
			
		}
		
		//retrieve data from form and insert into table
			@PostMapping("/updateproduct")
			private String updateProduct( @Valid @ModelAttribute("product") Product product,
		    BindingResult result) {
				System.out.println("in update product");
				System.out.println(product);
				System.out.println(result.toString());
				if(result.hasErrors()) {
					System.out.println("in if");
					return "editProduct";
				}else {
					boolean status=pservice.modifyProductById(product);
					return "redirect:/product/viewProducts";
				}
			}
			
			@GetMapping("/deleteproduct/{pid}")
			public String deleteProductById(@PathVariable("pid") int pid) {
				boolean status=pservice.deleteById(pid);
				return "redirect:/product/viewProducts";
			}
	










		
		
}

