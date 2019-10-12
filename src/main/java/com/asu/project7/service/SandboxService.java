package com.asu.project7.service;

import com.asu.project7.dto.StudentDTO;
import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SandboxService {

    @Autowired
    private StudentRepository studentRepository;

    public void verifyLogin(Student student) {
        if(0 < student.getStudentId()){
            Optional<Student> byId = this.studentRepository.findById(student.getStudentId());
            System.out.println("ByID="+byId);
        }
    }
}
