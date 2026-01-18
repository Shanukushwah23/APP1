package com.shanu.kushwah.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.shanu.kushwah.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	
//	Student login(String mail, String pwd);

	//List<Student> findByMailAndPwd(String mail, String pwd);


	Student findByMailAndPwd(String mail, String pwd);
}
