package com.asu.project7.controller;
/*
 *@author Ashutosh Dey
 */

import com.asu.project7.model.Assignment;
import com.asu.project7.service.RetrieveAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class RetrieveAssignmentController {
    @Autowired
    RetrieveAssignmentService retrieveAssignmentService;

    @RequestMapping(value = "/retrieveAssign", method = RequestMethod.GET)
    public Collection<Assignment> retrieveAssignment(@RequestParam int grade) {

        return this.retrieveAssignmentService.retrieveAssignment(grade);
    }
}
