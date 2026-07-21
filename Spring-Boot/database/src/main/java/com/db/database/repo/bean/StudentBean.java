package com.db.database.repo.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class StudentBean {
       @Id
	  private Integer stdId;
	   @Column
       private String stdName;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(Integer stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	@Override
	public String toString() {
		return "StudentBean [stdId=" + stdId + ", stdName=" + stdName + "]";
	}
	  
	  
}
