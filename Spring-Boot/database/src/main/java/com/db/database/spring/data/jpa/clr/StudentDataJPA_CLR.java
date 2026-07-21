package com.db.database.spring.data.jpa.clr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.db.database.repo.bean.StudentBean;
import com.db.database.repo.spring.data.jpa.Student_SpringDataJPA;

@Component
public class StudentDataJPA_CLR implements CommandLineRunner {
   @Autowired
   Student_SpringDataJPA data;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
           StudentBean s1=new StudentBean(1,"java");
           StudentBean s2=new StudentBean(2,"java");
           StudentBean s3=new StudentBean(3,"java");
           //to insert
           data.save(s1); 
           data.save(s2);
           data.save(s3);
           //to retr
           System.out.println(data.findById(2));
           //to delete
           data.deleteById(3);
           
	}

}
