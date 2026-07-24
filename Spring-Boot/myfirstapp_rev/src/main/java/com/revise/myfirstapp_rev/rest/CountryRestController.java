package com.revise.myfirstapp_rev.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revise.myfirstapp_rev.bean.CountryCaptil_Bean;

@RestController
@RequestMapping("ctry")
public class CountryRestController{
	
	@GetMapping("capital")
     public List<CountryCaptil_Bean> getCapital(){
    	 return Arrays.asList(
    			 
    			 new CountryCaptil_Bean("India","Delhi"),
    			 new CountryCaptil_Bean("USA","Washing Ton"),
    			 new CountryCaptil_Bean("Pakistan","Karachi"));
     }
}
