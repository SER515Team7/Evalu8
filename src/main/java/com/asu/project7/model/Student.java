package com.asu.project7.model;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @SequenceGenerator(name = "Student_id",sequenceName = "Student_Seq")
    @GeneratedValue(generator = "Student_id")
    @Column(name = "studentId")
    private Long studentId;
    private String name;
    private String dateOfBirth;

    public Student(Long studentId, String name, String dateOfBirth) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
