package com.example.restcrud.exception;

public class PersonalizedException extends RuntimeException {

    private String code;

    private String details;

    public PersonalizedException(String message, String code, String details) {
        super(message); // this.message = message;
        this.code = code;
        this.details = details;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

}
