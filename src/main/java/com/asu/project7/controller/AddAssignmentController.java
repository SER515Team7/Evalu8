package com.asu.project7.controller;

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
    public void addAssignment(@RequestBody String string) {
        this.addAssignmentService.addAssignment(string);

    }

}
