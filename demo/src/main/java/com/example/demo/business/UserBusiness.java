package com.example.demo.business;

import com.example.demo.entity.User;
import com.example.demo.exception.BaseException;
import com.example.demo.exception.UserException;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.MRegisterResponse;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserBusiness {

    private  final UserService userService;

    private final UserMapper userMapper;

    public UserBusiness(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    public MRegisterResponse userRegister(MRegisterResponse request) throws BaseException {
        User user =  userService.create(request.getEmail(), request.getPassword(), request.getName());

        return userMapper.toRegisterResponse(user);
    }
}
