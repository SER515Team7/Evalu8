package com.asu.project7.controller;

import com.asu.project7.dto.StudentDTO;
import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import com.asu.project7.service.SandboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sandbox")
@RestController
public class SandboxController {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    SandboxService sandboxService;

@RequestMapping(value = "/login",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Student> verifyLogin(@RequestBody Student student){

    return this.sandboxService.verifyLogin(student);
    //return new ResponseEntity<String>("message", HttpStatus.NOT_FOUND);


}

@RequestMapping(value = "/addStudent",method = RequestMethod.POST)
public void addStudent(@RequestBody Student student){
        this.sandboxService.addStudent(student);
    }

}
