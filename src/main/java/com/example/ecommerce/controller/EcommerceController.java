package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.ecommerce.service.CustomerService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EcommerceController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("/")
	public String homepage() {
		return "Home";
	}
	
	@GetMapping("/about-us")
	public String aboutUs() {
		return "AboutUs";
	}
	
	@GetMapping("/login")
	public String loadLogin() {
		return "Login.html";
	}
		
	@PostMapping("/login")
	public String login(@RequestParam String emph,@RequestParam String password,ModelMap map,HttpSession session) {
		return customerService.login(emph,password,map,session);
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session,ModelMap map) {
		session.invalidate();
		map.put("pass", "logout success");
		return "Home";
	}	
}
