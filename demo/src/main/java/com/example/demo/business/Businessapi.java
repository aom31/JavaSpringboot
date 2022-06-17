package com.example.demo.business;

import com.example.demo.exception.Baseexception;
import com.example.demo.exception.UserException;
import com.example.demo.model.Mregister;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class Businessapi {

    //connect and get to database mysql
    public String register(Mregister request) throws Baseexception {

        if (request == null) {
            throw UserException.requestNull();
        }

        //validate email
        if (Objects.isNull(request.getEmail())) {

            throw UserException.emailNull();
        }

        //validate
        return "";
    }
}
