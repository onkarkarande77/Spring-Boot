package com.db.database.spring.jdbc.clr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.db.database.repo.bean.EmployeeBean;
import com.db.database.repo.spring.jdbc.EmployeeRep_SpringJdbc;

/*@Component
public class EmpSpring_Jdbc_CLR implements CommandLineRunner {
	@Autowired
	EmployeeRep_SpringJdbc  jdbc;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//jdbc.delete();
		EmployeeBean e1=new EmployeeBean(1,"java");
		EmployeeBean e2=new EmployeeBean(2,"java");
		EmployeeBean e3=new EmployeeBean(3,"java");
		
		jdbc.insert(e1);
		jdbc.insert(e2);
        jdbc.insert(e3);
        
        System.out.println(jdbc.getRecord(2));
		System.out.println(jdbc.getRecord(3));
       
	}

}
*/