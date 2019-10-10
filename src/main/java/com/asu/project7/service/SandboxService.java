package com.asu.project7.service;

import com.asu.project7.dto.ExpressionDTO;
import org.springframework.stereotype.Service;

@Service
public class SandboxService {

    private ExpressionDTO validateExpression(){
        ExpressionDTO expressionDTO = new ExpressionDTO();
        return expressionDTO;
    }
}
