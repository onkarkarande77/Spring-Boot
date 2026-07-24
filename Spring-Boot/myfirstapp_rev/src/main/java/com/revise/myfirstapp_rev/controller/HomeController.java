package com.revise.myfirstapp_rev.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
 private Logger logger=LoggerFactory.getLogger(getClass());
 
 @RequestMapping("/")
 public String homePage() {
	 
	 return "index";
 }
 
 @RequestMapping("test")
 public String getPathData(@RequestParam String name,ModelMap model) {
	 model.put("name",name);
	 logger.debug("at debug level{}",name);
	 logger.info("at info level");
	 
	 System.out.println("i am at sop level "+name);
	 
	 return "index";
	 
	 
	 
 }
 
}
