package com.asu.project7.controller;


import com.asu.project7.model.Student;
import com.asu.project7.service.LoginService;
import com.asu.project7.service.SandboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<Student> verifyLogin(@RequestParam int studentId) {

        System.out.println("Received studentId:" + studentId);
        Student student = new Student();
        student.setStudentId(studentId);
//        ResponseEntity<Student> x = this.sandboxService.verifyLogin(student);
//        System.out.println(x.toString());
        return this.loginService.verifyLogin(student);
    }
}
