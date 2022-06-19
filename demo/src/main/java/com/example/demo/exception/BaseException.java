package com.example.demo.exception;

public abstract class BaseException extends Exception {

    public BaseException(String codeErr){
        super(codeErr);
    }
}
