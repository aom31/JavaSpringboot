package com.example.demo.business;

import com.example.demo.entity.User;
import com.example.demo.exception.UserException;
import com.example.demo.model.MRegister;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserBusiness {

    private  final UserService userService;

    public UserBusiness(UserService userService) {
        this.userService = userService;
    }


    public User userRegister(MRegister mRegisterRequest) throws UserException {
        User user =  userService.create(mRegisterRequest.getEmail(), mRegisterRequest.getPassword(), mRegisterRequest.getName());

        return user;

    }
}
