package com.zup.cqc.controller.errorhandler;

import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.List;

public class ValidationError {

    int numberOfErrors;
    List<ValidationFieldError> errorList = new ArrayList<>();

    /**
     * Build the error response
     *
     * @param fieldErrorList
     */
    public void buildError(List<FieldError> fieldErrorList){
        fieldErrorList.forEach(error -> {
            ValidationFieldError validationFieldError = new ValidationFieldError(error.getField(), error.getDefaultMessage());
            this.errorList.add(validationFieldError);
        }) ;
        numberOfErrors = this.errorList.size();
    }

    public int getNumberOfErrors() {
        return numberOfErrors;
    }

    public List<ValidationFieldError> getErrorList() {
        return errorList;
    }
}
