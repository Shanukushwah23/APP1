package com.shanu.kushwah.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shanu.kushwah.dao.StudentRepo;
import com.shanu.kushwah.entity.Student;
import com.shanu.kushwah.service.Studentservice;

import org.springframework.ui.Model;


@Controller
public class Mycontrller {

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private Studentservice studentservice;

    @GetMapping("/")
    public String root() {
        return "redirect:/shanu.html";
    }

    @GetMapping("/shanu")
    public String loginPage() {
        return "redirect:/shanu.html";
    }

    @PostMapping("/shanu")
    public String doLogin(
            @RequestParam String mail,
            @RequestParam String pwd) {

        Student student = studentservice.login(mail, pwd);

        if (student != null) {
            return "redirect:/home.html";
        } else {
            return "redirect:/shanu.html?error=true";
        }
    }

    @GetMapping("/res")
    public String registerPage() {
        return "redirect:/res.html";
    }

    @PostMapping("/kush")
    public String saveStudent(@ModelAttribute Student student) {
        studentRepo.save(student);
        return "redirect:/shanu.html";
    }

    @GetMapping("/home")
    public String home() {
        return "redirect:/home.html";
    }
}
