package com.learning.myfirstapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.myfirstapp.config.DatabaseConfiguration;

@RestController
@RequestMapping("config")
public class DatabaseConfigRestController {
	
	@Autowired
	DatabaseConfiguration conf;

	 	@GetMapping("db-service")
	 	public DatabaseConfiguration getDbConfig() {
	 		
	 		return conf;
	 	
	 	}
}
