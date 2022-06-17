package com.example.demo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "store_user")   //create name new table in database
public class User extends  BaseEntity{

    //get name colume for tavle user
    @Column(nullable = false, unique = true, length = 60)
    private String username;

    @Column(nullable = false, length = 30)
    private String password;

    @Column(nullable = false, length = 30)
    private String email;

}
