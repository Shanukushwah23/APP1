package com.shanu.kushwah.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shanu.kushwah.dao.StudentRepo;
import com.shanu.kushwah.entity.Student;
@Service
public class shanu  implements Studentservice{
	
	  @Autowired
	    private StudentRepo studentRepo;

	  @Override
	    public Student login(String mail, String pwd) {
	        return studentRepo.findByMailAndPwd(mail, pwd);

}
}