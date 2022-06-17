package com.example.demo.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@MappedSuperclass
public abstract class BaseEntity {

    //for connect database table
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid")
    @Column(length = 36, nullable = false, updatable = false)
    private String id;
}
