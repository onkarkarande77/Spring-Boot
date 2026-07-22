package com.proj.fin.loan.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.proj.fin.loan.bean.LoanBean;

@Service	 
//hold LOGIN FOR VARIOUS CRUD OPRS
public class LoanService {
//want to return a list of beans
	private static List<LoanBean> loanList=new ArrayList<LoanBean>();
	private static int loanId=0;
	
	static {//high priority to execute. initialization
		//adding data to the list
		loanList.add(new LoanBean(++loanId,"spring","ML","12234",LocalDate.now(),LocalDate.now().plusMonths(1)));
		loanList.add(new LoanBean(++loanId,"spring","BL","122345",LocalDate.now(),LocalDate.now().plusMonths(2)));
		loanList.add(new LoanBean(++loanId,"spring","PL","111134",LocalDate.now(),LocalDate.now().plusDays(15)));
		loanList.add(new LoanBean(++loanId,"spring","EL","1234234",LocalDate.now(),LocalDate.now().plusMonths(1)));
		
	}
	
//	public void addData(LoanBean lb) {
//		lb.setLoanId(++loanId);
//		lb.setDisbDate(LocalDate.now());
//		lb.setNextDueDate(LocalDate.now().plusDays(1));
//		
//		loanList.add(lb);
//		
//	}
	
	//add loan data
	
	public void addLoanData(String username,String mobileNo,String loanDesc) {
		           //create a loan bean
		     LoanBean lb=new LoanBean(++loanId,username,loanDesc,mobileNo,LocalDate.now(),LocalDate.now().plusYears(1));
		     
		     //add it to the collection
		     loanList.add(lb);
		     
		
	}
	
//	public void deleteLoanById(int id) {
//	    loanList.removeIf(lb -> lb.getLoanId() == id);
//	}
	
	//to delete a record
	public void findById(int id){
//		for(LoanBean lb:loanList) {
//			if(lb.getLoanId() == id) {
//			       loanList.remove(lb);
//			}}
		       //child is also acceptable
		
		Predicate<? super LoanBean> predicate=l -> l.getLoanId()==id;
		//predicate                              |it is pointing 
		loanList.removeIf(predicate);
		
	}
	
	//to update the record -part 1
	public LoanBean updById(int id){
		Predicate<? super LoanBean> predicate = l -> l.getLoanId()==id;
		//READ EVERY OBJECT IN THE LIST
		//CHECK FOR THE ID --USING PREDICATE
		//IN CASE OF POSITIVE MATCH, RETURN THE MATCHED OBJECT INTO A COLLECTION
		//FROM THE RETURNED COLLECTION ---GET THE FIRST OBJECT
		LoanBean lb=loanList.stream().filter(predicate ).findFirst().get();
		return lb;
		 
	}
	
	//to update the record -part 2
	public void revisedChanges(LoanBean lb) {
		//delete the record from the collection for the said id
		
		findById(lb.getLoanId()); //deletes the old one
		//add the new revised bean to the collection
		loanList.add(lb);
	}
	
	public List<LoanBean> getAllRecs(){
		
		return loanList; 
	}
}
