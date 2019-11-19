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
    private int quizId;
    private int questionId;
    private String questionData;
    private String answerData;
    private int marks;
}
