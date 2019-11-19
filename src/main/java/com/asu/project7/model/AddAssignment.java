package com.asu.project7.model;

import java.util.Collection;

public class AddAssignment {
    private String quizName;
    private int grade;
    private Collection<Questions> questionsList;

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

    public Collection<Questions> getQuestionsList() {
        return questionsList;
    }

    public void setQuestionsList(Collection<Questions> questionsList) {
        this.questionsList = questionsList;
    }
}
