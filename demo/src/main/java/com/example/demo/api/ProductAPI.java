package com.example.demo.api;

import com.example.demo.business.ProductBusiness;
import com.example.demo.exception.Baseexception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductAPI {

    @Autowired
    private ProductBusiness productbussi;

    @GetMapping("/{id}")
    public ResponseEntity<String> getProductbyid(@PathVariable("id") String id) throws Baseexception {
        String respon = productbussi.getProductByid(id);
        return ResponseEntity.ok(respon);
    }
}
