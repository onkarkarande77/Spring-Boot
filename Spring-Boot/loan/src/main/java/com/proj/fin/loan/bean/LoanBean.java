package com.proj.fin.loan.bean;

import java.time.LocalDate;

//HOLD ALL DATA RELATED TO THE LOAN CUSTOMER
public class LoanBean {
	private Integer loanId;
	private String loanee;//borrower
	private String loanDesc;
	private String mobileNo;
	private LocalDate disbDate;
	private LocalDate nextDueDate;
	
	public LoanBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanBean(Integer loanId, String loanee, String loanDesc, String mobileNo, LocalDate disbDate,
			LocalDate nextDueDate) {
		super();
		this.loanId = loanId;
		this.loanee = loanee;
		this.loanDesc = loanDesc;
		this.mobileNo = mobileNo;
		this.disbDate = disbDate;
		this.nextDueDate = nextDueDate;
	}

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public String getLoanee() {
		return loanee;
	}

	public void setLoanee(String loanee) {
		this.loanee = loanee;
	}

	public String getLoanDesc() {
		return loanDesc;
	}

	public void setLoanDesc(String loanDesc) {
		this.loanDesc = loanDesc;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LocalDate getDisbDate() {
		return disbDate;
	}

	public void setDisbDate(LocalDate disbDate) {
		this.disbDate = disbDate;
	}

	public LocalDate getNextDueDate() {
		return nextDueDate;
	}

	public void setNextDueDate(LocalDate nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	@Override
	public String toString() {
		return "LoanBean [loanId=" + loanId + ", loanee=" + loanee + ", loanDesc=" + loanDesc + ", mobileNo=" + mobileNo
				+ ", disbDate=" + disbDate + ", nextDueDate=" + nextDueDate + "]";
	}
	
	
	

}
