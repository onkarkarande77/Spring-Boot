package com.revise.myfirstapp_rev.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revise.myfirstapp_rev.DataBaseConfiguration;

@RestController
@RequestMapping("config")
public class DataBaseConfigRestController {
 @Autowired
 DataBaseConfiguration conf;
	@GetMapping("db-services")
	public DataBaseConfiguration getConn() {
		return conf;
	}
}
