package com.db.database.repo.spring.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.database.repo.bean.StudentBean;

public interface Student_SpringDataJPA extends JpaRepository<StudentBean,Integer> {
   
}
