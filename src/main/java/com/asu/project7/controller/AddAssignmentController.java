package com.asu.project7.controller;
/*
 *@author Ashutosh Dey
 */
import com.asu.project7.model.Assignment;
import com.asu.project7.service.AddAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AddAssignmentController {
    @Autowired
    AddAssignmentService addAssignmentService;

    @RequestMapping(value = "/addAssign", method = RequestMethod.POST)
    public void addAssignment(@RequestBody Assignment assignment) {
        this.addAssignmentService.addAssignment(assignment);

    }

}
