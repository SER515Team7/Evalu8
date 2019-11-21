package com.asu.project7.controller;

import com.asu.project7.dto.ExpressionDTO;
import com.asu.project7.service.SandboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/*This is the controller class that will handle all the REST requests*/

@RestController
@RequestMapping("/sandbox")
public class SandboxController {

    @Autowired
    SandboxService sandboxService;

    /*This method is for the verification of the login credentials*/
    /*@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<Student> verifyLogin(@RequestParam int studentId) {

        System.out.println("Received studentId:" + studentId);
        Student student = new Student();
        student.setStudentId(studentId);
//        ResponseEntity<Student> x = this.sandboxService.verifyLogin(student);
//        System.out.println(x.toString());
        return this.sandboxService.verifyLogin(student);
    }*/

    /*This method is for the creation of a new student record*/
    /*@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student) {
        this.sandboxService.addStudent(student);
    }*/

    @RequestMapping(value = "/validate")
    public ExpressionDTO validateExpression(@RequestParam String expression) {
        ExpressionDTO expressionDTO;

        expressionDTO = sandboxService.validateExpression(expression);

        return expressionDTO;
    }
}
