package com.example.demo.controller;

import com.example.demo.model.JsonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testapi")
public class TestApi {

    @GetMapping("/view")
    public JsonResponse viewData(){
        JsonResponse response = new JsonResponse();
        //set data init
        response.setName("aom");
        response.setFood("padthai");
        return response;
    }

    @PostMapping("/register")
    public String register(){

        return "";
    }


}
