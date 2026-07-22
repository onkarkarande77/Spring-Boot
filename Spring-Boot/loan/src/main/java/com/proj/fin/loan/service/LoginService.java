package com.proj.fin.loan.service;

import org.springframework.stereotype.Service;
//AUTH done separately -ease of maintenance and re-usablity
@Service
public class LoginService {
	
	public boolean auth(String userName,String userPwd) {
		 Boolean isValidUser=userName.trim().equalsIgnoreCase("spring");
		 Boolean isValidPwd=userPwd.trim().equalsIgnoreCase("java");
		 //return true;
		 return isValidUser && isValidPwd;
		/*if(userName.equals("spring") && userPwd.equals("java")) {
		return true;
		}
		else 
			return false;*/

}
}