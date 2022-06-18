package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.exception.UserException;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {
    private final UserRepository repository;

    public  UserService(UserRepository repository){
        this.repository = repository;

    }

    public User createUser(String username, String password, String email) throws UserException {
        //validate  (data is not null)
        if (Objects.isNull(email)){
            //throw error email null
            throw UserException.createemailNull();
        }

        if (Objects.isNull(username)){
            //throw error username null
            throw UserException.createusernameNull();
        }

        if (Objects.isNull(password)){
            //throw error password null
            throw UserException.createpasswordNull();
        }


        //verify  (it have exist  )
        if (repository.existByEmail(email)){
            //throw error email is already exist duplicate

            throw  UserException.createemailDuplicate();

        }

        //save
        User entity = new User();
        entity.setUsername(username);
        entity.setPassword(password);
        entity.setEmail(email);

        return  repository.save(entity);
    }

}
