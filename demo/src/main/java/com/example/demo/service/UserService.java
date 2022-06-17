package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    public  UserService(UserRepository repository){
        this.repository = repository;

    }

    public User createUser(String username, String password, String email){
        User entity = new User();
        entity.setUsername(username);
        entity.setPassword(password);
        entity.setEmail(email);

        return  repository.save(entity);
    }

}
