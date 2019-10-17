package com.asu.project7.service;

import com.asu.project7.dto.ExpressionDTO;
import org.springframework.stereotype.Service;

@Service
public class SandboxService {

    public ExpressionDTO validateExpression(String expression){
        ExpressionDTO expressionDTO = new ExpressionDTO();
        return expressionDTO;
    }
}
