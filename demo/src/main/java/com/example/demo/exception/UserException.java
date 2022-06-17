package com.example.demo.exception;

public class UserException extends Baseexception {
    public UserException(String codeerr) {
        super("user."+ codeerr);
    }   //find word user


    public static UserException requestNull(){
        return  new UserException("register.request.null");
    }
    //when register fail
    public static UserException emailNull(){
        return  new UserException("register.email.null");
    }
}
