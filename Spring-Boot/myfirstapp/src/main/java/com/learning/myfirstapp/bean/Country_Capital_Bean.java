package com.learning.myfirstapp.bean;

public class Country_Capital_Bean {
	private String ctryName;
	private String ctryCap;
	
	public Country_Capital_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Country_Capital_Bean(String ctryName, String ctryCap) {
		super();
		this.ctryName = ctryName;
		this.ctryCap = ctryCap;
	}
	
	
	public String getCtryName() {
		return ctryName;
	}
	public void setCtryName(String ctryName) {
		this.ctryName = ctryName;
	}
	public String getCtryCap() {
		return ctryCap;
	}
	public void setCtryCap(String ctryCap) {
		this.ctryCap = ctryCap;
	}
	
	

}
