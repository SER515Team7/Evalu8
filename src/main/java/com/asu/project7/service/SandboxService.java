package com.asu.project7.service;

import com.asu.project7.dto.ExpressionDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.asu.project7.model.Student;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class SandboxService {

    @Autowired
    private StudentRepository studentRepository;


    public ExpressionDTO validateExpression(String expression) {
        ExpressionDTO expressionDTO = new ExpressionDTO();
        if (expression.equals(null) || expression.length() == 0) {
            expressionDTO.isValid = false;
            expressionDTO.result = null;
            expressionDTO.error = "Empty String";
            return expressionDTO;
        }

        final String uri = "http://api.mathjs.org/v4/";//API for validating and evaluating math expressions
        RestTemplate restTemplate = new RestTemplate();

        String request = "{\"expr\":[\"" + expression + "\"]}";
        expressionDTO = restTemplate.postForObject(uri, request, ExpressionDTO.class);
        if (expressionDTO.error == null)
            expressionDTO.setValid(true);
        else
            expressionDTO.setValid(false);


        return expressionDTO;

    }

    /*This method is for the creation of a new student record*/
    /*public void addStudent(Student student) {
        Student student_after_add = this.studentRepository.save(student);
        if (student.getStudentId() == student_after_add.getStudentId()) {
            System.out.println("Student with ID:" + student_after_add.getStudentId() + " created successfully!");
        }
    }*/

    /*This method is for the verification of the login credentials*/
    /*public ResponseEntity<Student> verifyLogin(Student student) {

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

            *//*System.out.println("Name "+byId.get().getName());*//*


        }

        return loginResult;
    }*/
}