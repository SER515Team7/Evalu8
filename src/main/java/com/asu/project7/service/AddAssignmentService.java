package com.asu.project7.service;
/*
 *@author Ashutosh Dey
 */

import com.asu.project7.model.Assignment;
import com.asu.project7.model.Questions;
import com.asu.project7.model.Quiz;
import com.asu.project7.repository.QuestionRepository;
import com.asu.project7.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAssignmentService {

    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionRepository questionRepository;

    public void addAssignment(Assignment assignment) {

        /*Testing the received assignment details*/
        System.out.println(assignment.getGrade());
        System.out.println(assignment.getQuizName());

        for (Questions question : assignment.getQuestionsList()) {
            System.out.println(question.getQuestionData());
            System.out.println(question.getAnswerData());
            System.out.println(question.getMarks());
        }

        /*Separating the quiz details and assignment details*/

        /*Saving the quiz details to the DB*/
        Quiz createQuiz = new Quiz();
        createQuiz.setGrade(assignment.getGrade());
        createQuiz.setQuizName(assignment.getQuizName());
        Quiz createQuiz_after_add = this.quizRepository.save(createQuiz);
        System.out.println("Quiz Details with ID:" + createQuiz_after_add.getQuizId() + " created successfully.");
        /*Saving the question details to the DB*/
        Questions addQuestions;
        for (Questions eachQuestion : assignment.getQuestionsList()) {
            addQuestions = new Questions();
            addQuestions.setQuestionData(eachQuestion.getQuestionData());
            addQuestions.setAnswerData(eachQuestion.getAnswerData());
            addQuestions.setMarks(eachQuestion.getMarks());
            addQuestions.setQuizId(createQuiz_after_add.getQuizId());
            Questions questions_after_add = this.questionRepository.save(addQuestions);
            System.out.println("Question Details with ID:" + questions_after_add.getQuestionId() + " created successfully.");

        }

    }
}
