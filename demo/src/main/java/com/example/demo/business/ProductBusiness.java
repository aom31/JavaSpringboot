package com.example.demo.business;

import com.example.demo.exception.Baseexception;
import com.example.demo.exception.ProductException;

import java.util.Objects;

public class ProductBusiness {

    //connect and get to database mysql


    public String getProductByid(String id) throws Baseexception {
        if (Objects.equals("234",id)){
            throw ProductException.notFound();
        }

        return id;
    }
}
