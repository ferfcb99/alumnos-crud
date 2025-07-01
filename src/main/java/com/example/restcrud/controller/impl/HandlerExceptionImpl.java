package com.example.restcrud.controller.impl;

import com.example.restcrud.controller.HandlerException;
import com.example.restcrud.dto._responses.ResponseErrorApi;
import com.example.restcrud.exception.PersonalizedException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // reaccione a las excepciones
public class HandlerExceptionImpl implements HandlerException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ResponseErrorApi> handleMethodArgumentNotValidException(MethodArgumentNotValidException e){
        ResponseErrorApi response = new ResponseErrorApi();
        response.setError(e.getMessage());
        response.setMessage("Arguments not valid for JPA Validation");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }


    //DataIntegrityViolationException
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ResponseErrorApi> handleDataIntegrityViolationException(DataIntegrityViolationException e){
        ResponseErrorApi response = new ResponseErrorApi();
        response.setError(e.getMessage());
        response.setMessage("Se violó alguna regla de la integridad de la base de datos");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(PersonalizedException.class)
    public ResponseEntity<ResponseErrorApi> handlePersonalizedException(PersonalizedException e){
        ResponseErrorApi response = new ResponseErrorApi();
        response.setMessage(e.getMessage());
        response.setError(e.getDetails());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

}
