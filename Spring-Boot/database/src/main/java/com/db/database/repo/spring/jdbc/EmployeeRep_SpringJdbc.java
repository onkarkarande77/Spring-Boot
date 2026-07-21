package com.db.database.repo.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.db.database.repo.bean.EmployeeBean;

@Repository
public class EmployeeRep_SpringJdbc {

	@Autowired
	JdbcTemplate jt;
	
	/*String ins_qry1 = "insert into emp values(1,'java')";
	String ins_qry2 = "insert into emp values(2,'java')";*/
	
	//String del_qry="delete from emp where id=2";
	
 
	
	//to insert data
	public void insert(EmployeeBean e) {
		
//		jt.update(ins_qry1);
//		jt.update(ins_qry2);
		
		jt.update("insert into emp values(?,?)",e.getId(),e.getName());
			
	}
	
//	public void delete() {
//		// jt.update(del_qry);
//	}
	
	public EmployeeBean getRecord(int id) {
		
	    return jt.queryForObject("select * from emp where id=?",new BeanPropertyRowMapper<>(EmployeeBean.class),id);
	}
	
}
