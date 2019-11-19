package com.asu.project7.model;


/*
 *@author Ashutosh Dey
 */
import javax.persistence.*;

/*This entity class defines the structure of the Student object*/
@Entity
/*This annotation will automatically create the required table in the the DB specified in application.properties*/
@Table(name="quizData")
public class Quiz {

    @Id
    @SequenceGenerator(name = "Quiz_id",sequenceName = "Quiz_Seq")
    @GeneratedValue(generator = "Quiz_id")
    @Column(name = "quizId")
    private int quizId;
    private String quizName;
    private int grade;

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

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
}
