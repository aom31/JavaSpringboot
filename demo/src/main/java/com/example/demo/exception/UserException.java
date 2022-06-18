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

    //create user
    public static UserException createemailNull(){
        return  new UserException("create.email.null");
    }

    public static UserException createemailDuplicate(){
        return  new UserException("create.email.duplicate");
    }

    public static UserException createusernameNull(){
        return  new UserException("create.username.null");
    }

    public static UserException createpasswordNull(){
        return  new UserException("create.password.null");
    }
}
