package com.zup.cqc.controller.errorhandler;

public class ValidationFieldError {
    private String field;
    private String message;

    public ValidationFieldError(String field, String defaultMessage) {
        this.field = field;
        this.message = defaultMessage;
    }

    public String getField() {
        return field;
    }

    public String getMessage() {
        return message;
    }
}
