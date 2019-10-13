package com.asu.project7.service;

import com.asu.project7.dto.StudentDTO;
import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class SandboxService {

    @Autowired
    private StudentRepository studentRepository;


    public void verifyLogin(Student student) {

        if(0 < student.getStudentId()){

            try{
                Optional<Student> retrievedStudent = this.studentRepository.findById(student.getStudentId());
                if (retrievedStudent.get().getStudentId() == student.getStudentId()){
                    System.out.println("Student Exists");
                }
            }
            catch (NoSuchElementException e){
                System.out.println(e.toString());
            }

            /*System.out.println("Name "+byId.get().getName());*/


        }
    }

    public void addStudent(Student student){
        Student student_after_add = this.studentRepository.save(student);
        if(student.getStudentId()==student_after_add.getStudentId()) {
            System.out.println("Student with ID:"+student_after_add.getStudentId()+" created successfully!");
        }
    }
}
