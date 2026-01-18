package com.shanu.kushwah.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long uid;   // Primary Key (auto increment)

    String name;
    String mail;
     String mobile;
     String shanu;
     
     
     public String getShanu() {
		return shanu;
	}

	public void setShanu(String shanu) {
		this.shanu = shanu;
	}

	String pwd;
     

    // Default Constructor
   

    // Parameterized Constructor
    /*
    public Student(String name, String mail, String mobile, String pwd) {
        this.name = name;
        this.mail = mail;
        this.mobile = mobile;
        this.pwd = pwd;
    }
*/
    // Getters and Setters
    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
