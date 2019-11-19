package com.asu.project7.controller;

import com.asu.project7.model.Assignment;
import com.asu.project7.service.RetrieveAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RetrieveAssignmentController {
    @Autowired
    RetrieveAssignmentService retrieveAssignmentService;

    @RequestMapping(value = "/retrieveAssign", method = RequestMethod.GET)
    public ResponseEntity<Assignment> retrieveAssignment(@RequestParam int grade) {

        Assignment assignment = new Assignment();
        assignment.setGrade(grade);

        return new ResponseEntity<Assignment>(null);
    }
}
