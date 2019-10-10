package com.asu.project7.controller;

import com.asu.project7.dto.ExpressionDTO;
import com.asu.project7.dto.StudentDTO;
import com.asu.project7.model.Student;
import com.asu.project7.repository.StudentRepository;
import com.asu.project7.service.SandboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/sandbox")
@RestController
public class SandboxController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SandboxService sandboxService;

    @RequestMapping(value="/validate")
    public ExpressionDTO validateExpression(String expression){
        ExpressionDTO expressionDTO = new ExpressionDTO();
       // expressionDTO;
        return  expressionDTO;
    }



}
