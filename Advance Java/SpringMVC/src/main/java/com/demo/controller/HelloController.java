package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String sayHello() {
		return "Login";
	}
	
	@RequestMapping("/test")
	public String gettest(Model model) {
		model.addAttribute("m1","This msg is from m1");
		model.addAttribute("m2","This  msg is from  m2");
		return "testmodel";
	}
	
	@GetMapping("/hello")
	public ModelAndView getMessage() {
		String msg=" from getMessage";
		return new ModelAndView("greet","message",msg);
	}
	
}
