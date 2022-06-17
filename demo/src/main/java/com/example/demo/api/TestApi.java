package com.example.demo.api;

import com.example.demo.business.Businessapi;
import com.example.demo.exception.Baseexception;
import com.example.demo.exception.FileUploadException;
import com.example.demo.model.Mregister;
import com.example.demo.model.Mresponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/test")
public class TestApi {

    @Autowired
    private Businessapi businessapi;
    @GetMapping("/getread")
    public Mresponse test() {
        Mresponse respon = new Mresponse();
        respon.setName("aom");
        respon.setEmail("aom@gmail.com");
        return respon;
    }

    @PostMapping
    @RequestMapping("/inputregister")
    public ResponseEntity<String> register(@RequestBody Mregister register) throws Baseexception {   //use responseentity for http
        String respo = businessapi.register(register);
        return ResponseEntity.ok(respo);
    }

    @PostMapping
    @RequestMapping("/uploadfile")
    public ResponseEntity<String> uploadFilepicture(@RequestPart  MultipartFile file) throws FileUploadException {
        String response = businessapi.uploadFilepicture(file);
        return  ResponseEntity.ok(response);
    }




}
