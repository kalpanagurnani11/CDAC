package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.beans.MyUser;
import com.demo.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	LoginService lservice;
	
	@PostMapping("/validate")
   public ModelAndView validateUser(@RequestParam("uname") String u1,@RequestParam("pass") String pass) {
		MyUser user1=lservice.validateUser(u1,pass);
		if(user1!=null) {
			return new ModelAndView("redirect:/product/viewProducts");
		}else {
			return new ModelAndView("Login","message","invalid credentials pls relogin");
		}
	   
   }
}
