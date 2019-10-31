package com.asu.project7.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExpressionDTO {

    public String[] result;
    public boolean isValid;
    public String error;

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean ifValid) {
        isValid = ifValid;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "ExpressionDTO{" +
                "result=" + Arrays.toString(result) +
                ", isValid=" + isValid +
                ", error='" + error + '\'' +
                '}';
    }

    public String[] getResult() {
        return result;
    }

    public void setResult(String[] result) {
        this.result = result;
    }
}
