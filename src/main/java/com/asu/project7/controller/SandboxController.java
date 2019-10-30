package com.asu.project7.controller;

import com.asu.project7.dto.StudentDTO;
import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import com.asu.project7.service.SandboxService;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.json.GsonJsonParser;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/sandbox")
@RestController
public class SandboxController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    SandboxService sandboxService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<Student> verifyLogin(@RequestParam int studentId )  {

        System.out.println("Received studentId:"+studentId);
        Student student=new Student();
        student.setStudentId(studentId);
        return this.sandboxService.verifyLogin(student);
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
        this.sandboxService.addStudent(student);
    }

}
