package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Cleanup;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "m_user")
public class User  extends  BaseEntity{

    //set name column head
    @Column(nullable = false, unique = true, length = 40)
    private String email;

    //not send password

    @Column(nullable = false, length = 20)
    private String password;

    @Column(nullable = false, length = 60)
    private String name;

    private String civilId;


}
