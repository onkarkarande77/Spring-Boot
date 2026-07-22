package com.proj.fin.loan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.proj.fin.loan.service.LoginService;

import jakarta.servlet.http.HttpSession;

@SessionAttributes("username")
@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
 /*LoginService loginServ;
	public LoginController(LoginService loginServ) {
		// TODO Auto-generated constructor stub
		this.loginServ=loginServ;
	}*/
	
//create a mapping for logging
	@GetMapping("login")	
	public String goToLoginPage() {
		return "login";
	} 
	//create a mapping to capturing the login data
	@GetMapping("loginaction")
	public String loginAuth(@RequestParam String userName,@RequestParam String userPwd,ModelMap model) {	
		if(loginService.auth(userName, userPwd)) {
			//session.setAttribute("username",userName);
			model.put("username",userName);
			return "welcome";
			
		}
		else {
			model.put("errMsg","invalid credentials,please login again");
		  return "login";
		}
	
	  }
	}

