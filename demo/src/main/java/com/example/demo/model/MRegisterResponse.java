package com.example.demo.model;

import lombok.Data;

@Data
public class MRegisterResponse {

    private String name;

    private String email;


    public String getPassword() {
        return "";
    }
}
