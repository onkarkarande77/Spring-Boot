package com.proj.fin.loan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.proj.fin.loan.bean.LoanBean;
import com.proj.fin.loan.service.LoanService;

import jakarta.servlet.http.HttpSession;
@SessionAttributes("username")
@Controller

public class LoanController {
	@Autowired
	LoanService loanServ;
	
//	@GetMapping("add")
//	public String getSignupPage() {
//		return "loan_signup";
//	}
	
	@GetMapping("add_data")
	public String showAddDataPage() {
		return "add_data";
	}
	
	
	
  //when the url pattern matches the below ,it should return a
	//list of object to the view page
	 @GetMapping("list-all")
	 public String getAllRecs(ModelMap model,HttpSession session) {
		 //invoke the sl
		// session.getAttribute("username");
		 List<LoanBean> list=loanServ.getAllRecs();
         model.put("list", list);
		 
		 return "list_all";
	 }
 
//	 //this method add data into the bean by dynamically..
//	 @GetMapping("send-data")
//	 public String sendDataToBean(@RequestParam String loanee,@RequestParam String loanDesc,@RequestParam String mobileNo,ModelMap model) {
//		 LoanBean lb=new LoanBean();
//		 lb.setLoanee(loanee);
//		 lb.setLoanDesc(loanDesc);
//		 lb.setMobileNo(mobileNo);
//		 
//		 loanServ.addData(lb);
//		         
//		 return "list_all";
//	 }
	
	 //this is to add the new data
	 @GetMapping("add_action")
	 public String confirmNewData(ModelMap model,@RequestParam String mobileNo,@RequestParam String loanDesc){
		//now,retrive the user name from the model
		 //.String username= (String)model.get("username");
		 
		 loanServ.addLoanData((String)model.get("username"), mobileNo, loanDesc);
		 return "redirect:list-all";
	 }
	 
//	 @GetMapping("deleteLoan")
//	 public String deleteLoan(@RequestParam int loanId) {
//	     loanServ.deleteLoanById(loanId);
//	     return "redirect:/list-all";
//	 }
	 
	 //method delete a record
	 @GetMapping("delete_loan")
	 public String deleteRecById(@RequestParam Integer id) {
		 loanServ.findById(id);
		 return "redirect:list-all";
	 }
	 
	 //going to the update page for changes
	 @GetMapping("update_loan")
	 public String showUpdPage(@RequestParam Integer id,ModelMap model) {
		 LoanBean lb=loanServ.updById(id);
		 //inject the bean into the model
		 model.put("ln_bn",lb);
		 
		 return "update";
	 }
	 
	 //to the get and update the data
	 @GetMapping("update_action")
	 public String reviseUpdPage(LoanBean lb) {//here LoanBean contains the revised changes
		 System.out.println(lb.getLoanId());
		 loanServ.revisedChanges(lb);
		 
		 return "redirect:list-all";
	 }
	 
	 
	 
}
