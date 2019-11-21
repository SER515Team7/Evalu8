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

import java.util.*;

@Service
public class RetrieveAssignmentService {
    @Autowired
    private QuizRepository quizRepository;
    @Autowired
    private QuestionRepository questionRepository;

    public Collection<Assignment> retrieveAssignment(int gradeQuizDetails) {


        Iterable<Quiz> quizDetails = this.quizRepository.findAll();
        Iterable<Questions> questionDetails = this.questionRepository.findAll();
        List<Assignment> assignmentList = new ArrayList<>();
        Map<Integer, List<Questions>> questionsList = new HashMap<>();
//        Collection<Assignment> assign=assignmentList;


        for (Questions eachQuestion : questionDetails) {
            if (questionsList.containsKey(eachQuestion.getQuizId())) {
                questionsList.get(eachQuestion.getQuizId()).add(eachQuestion);
            } else {
                List<Questions> eachQuestionList = new ArrayList<Questions>();
                eachQuestionList.add(eachQuestion);
                questionsList.put(eachQuestion.getQuizId(), eachQuestionList);
            }
        }


        for (Quiz eachQuiz : quizDetails) {
            if (eachQuiz.getGrade() == gradeQuizDetails) {
                Assignment eachAssignment = new Assignment();
                eachAssignment.setGrade(eachQuiz.getGrade());
                eachAssignment.setQuizId(eachQuiz.getQuizId());
                eachAssignment.setQuizName(eachQuiz.getQuizName());

                eachAssignment.setQuestionsList(questionsList.get(eachQuiz.getQuizId()));
                assignmentList.add(eachAssignment);
            }

        }


//        System.out.println(assignmentList.toArray());
        return assignmentList;
    }
}
