package com.asu.project7.service;

import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddStudentService {

    @Autowired
    private StudentRepository studentRepository;

    /*This method is for the creation of a new student record*/
    public void addStudent(Student student) {
        Student student_after_add = this.studentRepository.save(student);
        if (student.getStudentId() == student_after_add.getStudentId()) {
            System.out.println("Student with ID:" + student_after_add.getStudentId() + " created successfully!");
        }
    }

}
