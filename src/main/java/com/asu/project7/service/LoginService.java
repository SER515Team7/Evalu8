package com.asu.project7.service;
/*
 *@author Ashutosh Dey
 */
import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service

public class LoginService {

    @Autowired
    private StudentRepository studentRepository;
    /*This method is for the verification of the login credentials*/
    public ResponseEntity<Student> verifyLogin(Student student) {

        System.out.println(student.getStudentId());
        ResponseEntity<Student> loginResult = null;

        if (0 < student.getStudentId()) {

            try {
                Optional<Student> retrievedStudent = this.studentRepository.findById(student.getStudentId());
                if (retrievedStudent.get().getStudentId() == student.getStudentId()) {
                    System.out.println("Student Exists");
                    student = retrievedStudent.get();
                    loginResult = new ResponseEntity<Student>(student, HttpStatus.OK);
                }
            } catch (NoSuchElementException e) {
                System.out.println(e + "Student does not exist");
                loginResult = new ResponseEntity<Student>(student, HttpStatus.NOT_FOUND);

                return loginResult;
            }

            /*System.out.println("Name "+byId.get().getName());*/


        }

        return loginResult;
    }
}
