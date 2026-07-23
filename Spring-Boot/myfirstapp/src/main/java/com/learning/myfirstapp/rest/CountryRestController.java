package com.learning.myfirstapp.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.myfirstapp.bean.Country_Capital_Bean;

@RestController
@RequestMapping("country")
public class CountryRestController {
	
	//define an end point
	@GetMapping("capital")
	public List<Country_Capital_Bean> getCtryCap(){
	     //return null;
          return Arrays.asList(
        		    new Country_Capital_Bean("india","New Delhi"), 
        		    new Country_Capital_Bean("USA","Washington DC"),
        		    new Country_Capital_Bean("Japan","Tokyo"),
        		    new Country_Capital_Bean("pak","karachi")
        		  );
	
	
	} 

}
