package com.asu.project7.model;
/*
 *@author Ashutosh Dey
 */
import javax.persistence.*;

/*This entity class defines the structure of the Student object*/
@Entity
/*This annotation will automatically create the required table in the the DB specified in application.properties*/
@Table(name="questionData")
public class Questions {
    @Id
    @SequenceGenerator(name = "Question_id",sequenceName = "Question_Seq")
    @GeneratedValue(generator = "Question_id")
    @Column(name = "questionId")
    private int questionId;
    private int quizId;
    private String questionData;
    private String answerData;
    private int marks;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public String getQuestionData() {
        return questionData;
    }

    public void setQuestionData(String questionData) {
        this.questionData = questionData;
    }

    public String getAnswerData() {
        return answerData;
    }

    public void setAnswerData(String answerData) {
        this.answerData = answerData;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


}
