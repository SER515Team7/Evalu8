package com.asu.project7.model;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @SequenceGenerator(name = "Student_id",sequenceName = "Student_Seq")
    @GeneratedValue(generator = "Student_id")
    @Column(name = "studentId")
    private int studentId;
    private String name;
    private String dateOfBirth;
    private int grade;

    public Student(int studentId, String name, String dateOfBirth, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
    }

    public Student() {
        this.studentId=007;
        this.name = "name";
        this.dateOfBirth = "dateOfBirth";
        this.grade=3;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
