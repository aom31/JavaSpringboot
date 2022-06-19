package com.example.demo.controller;

import com.example.demo.business.UserBusiness;
import com.example.demo.entity.User;
import com.example.demo.exception.BaseException;
import com.example.demo.model.MRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserApi {


    @Autowired
    public UserBusiness userBusiness;


    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody MRegister mRegisterRequest)  throws BaseException {

        User response = userBusiness.userRegister(mRegisterRequest);
        return ResponseEntity.ok(response);


    }
}
