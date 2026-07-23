package com.learning.myfirstapp.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	//logging
	private Logger logger=LoggerFactory.getLogger(getClass());
	
	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	 @RequestMapping("test")
	 public String getPathData(@RequestParam String name,ModelMap model) {
		   model.put("name",name);
		   logger.debug("at debug level {}",name);//for DEVP ENV
		   logger.info("at info level");//for PROD ENV
		   System.out.println("i am at sop level "+name);//NOT RECOMMENDED AT ALL 
		 return "hello";
	 }
	
	@RequestMapping("hello")
	public String helloPage() {
		return "hello";
	}

	
	 
	 @RequestMapping("/*")
	 public String wrongPage() {
		 return "fail";
	 }
}
