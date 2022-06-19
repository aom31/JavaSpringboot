package com.example.demo.controller;

import com.example.demo.business.ProductBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductApi {

    @Autowired
    public ProductBusiness productBusiness;


    @GetMapping("/detail/{id}")
    public ResponseEntity<String> getProductById(@PathVariable("id") String id){
        String response = productBusiness.getProductById(id);
        return  ResponseEntity.ok(response);

    }
}
