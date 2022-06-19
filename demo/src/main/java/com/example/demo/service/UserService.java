package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserException;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //creaete method function
    public User create(String email, String password, String name) throws UserException {
        //validate
        //data not null
        if(Objects.isNull(email)){
            //throw error email null
            throw UserException.createEmailNull();
        }
        if (Objects.isNull(password)){
            //throw error password null
            throw  UserException.createPasswordNull();
        }
        if(Objects.isNull(name)){
            //throw error name null
            throw UserException.createNameNull();
        }

        //verify check data is exist on repo
        if(userRepository.existsByEmail(email)){
            //throw error email is exist
            throw  UserException.createEmailDuplicate();
        }


        //save
        User entity = new User();
        entity.setEmail(email);
        entity.setPassword(password);
        entity.setName(name);

        return userRepository.save(entity);
    }
}
