package com.example.demo.business;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductBusiness {

    public String getProductById(String id){
        return id;
    }
}
