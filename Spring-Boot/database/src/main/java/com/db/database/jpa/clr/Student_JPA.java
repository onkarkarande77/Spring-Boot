package com.db.database.jpa.clr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.db.database.repo.bean.StudentBean;
import com.db.database.repo.jpa.StudentRepo_JPA;

/*@Component
public class Student_JPA implements CommandLineRunner {
   @Autowired
   StudentRepo_JPA jpa;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		StudentBean s1=new StudentBean(1,"java");
		StudentBean s2=new StudentBean(2,"java");
		StudentBean s3=new StudentBean(3,"java");
		
		jpa.insert(s1);
		jpa.insert(s2);
		jpa.insert(s3);
		//retrieve the rec
		System.out.println(jpa.findById(1));
		//jpa.deleteById(1);
		
	}

}*/
