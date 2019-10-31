package com.asu.project7.service;

import com.asu.project7.dto.ExpressionDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SandboxService {

    public ExpressionDTO validateExpression(String expression){
        ExpressionDTO expressionDTO = new ExpressionDTO();
        if(expression.equals(null)||expression.length()==0) {
           expressionDTO.isValid = false;
            expressionDTO.result = null;
            expressionDTO.error = "Empty String";
            return expressionDTO;
        }

        final String uri = "http://api.mathjs.org/v4/";//API for validating and evaluating math expressions
        RestTemplate restTemplate = new RestTemplate();

        String request = "{\"expr\":[\""+expression+"\"]}";
        expressionDTO = restTemplate.postForObject(uri,request,ExpressionDTO.class);
        if(expressionDTO.error==null)
            expressionDTO.setValid(true);
        else
            expressionDTO.setValid(false);


        return expressionDTO;
    }
}
