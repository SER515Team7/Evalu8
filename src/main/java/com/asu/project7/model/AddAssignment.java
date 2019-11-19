package com.asu.project7.model;

import java.util.ArrayList;

public class AddAssignment {
    private String quizName;
    private int grade;
    private ArrayList<Questions> questionsList;

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public ArrayList<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(ArrayList<Questions> questionsList) {
        this.questionsList = questionsList;
    }
}
