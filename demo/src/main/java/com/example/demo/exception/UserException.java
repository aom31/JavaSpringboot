package com.example.demo.exception;

public class UserException extends BaseException {
    public UserException(String codeErr) {
        super("user"+ codeErr); //preface for every error
    }

    //request null
    public static UserException requestNull(){
        return new UserException("request.null");
    }

    //for tell login fail ,sign in fail

    //user.register.email.null
    public static UserException emailNull(){
        return new UserException("register.email.null");
    }

}
