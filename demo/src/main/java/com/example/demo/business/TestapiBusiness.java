package com.example.demo.business;

import com.example.demo.exception.UserException;
import com.example.demo.model.MRegister;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Objects;

@Service
public class TestapiBusiness {

    public String register(MRegister mRegisterRequest) throws UserException {
        //request null validate
        if( mRegisterRequest == null){
            throw UserException.requestNull();
        }

        //validate email
        if (Objects.isNull(mRegisterRequest.getEmail())){
            throw UserException.emailNull();
        }
        return "";

    }
}
