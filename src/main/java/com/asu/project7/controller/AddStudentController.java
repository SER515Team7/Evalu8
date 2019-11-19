package com.asu.project7.controller;
/*
 *@author Ashutosh Dey
 */
import com.asu.project7.model.Student;
import com.asu.project7.service.AddStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AddStudentController {

    @Autowired
    AddStudentService addStudentService;
    /*This method is for the creation of a new student record*/
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student) {
        this.addStudentService.addStudent(student);
    }
}
