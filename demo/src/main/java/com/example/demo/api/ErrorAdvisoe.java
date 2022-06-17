package com.example.demo.api;

import com.example.demo.exception.Baseexception;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ErrorAdvisoe {


    //for show error with 417http and "timestamp" "status" "error" for clean message
    @ExceptionHandler(Baseexception.class)
    public ResponseEntity<ErrorResponse> handlerBaseException(Baseexception e){
        ErrorResponse response = new ErrorResponse();
        response.setError(e.getMessage());
        response.setStatus(HttpStatus.EXPECTATION_FAILED.value());

        return new ResponseEntity<>(response,  HttpStatus.EXPECTATION_FAILED);
    }

    @Data
    public static class ErrorResponse{

        private LocalDateTime timestamp = LocalDateTime.now();

        private int status;

        private String error;
    }
}
