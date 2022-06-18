package com.example.demo.business;

import com.example.demo.entity.User;
import com.example.demo.exception.Baseexception;
import com.example.demo.exception.FileUploadException;
import com.example.demo.exception.UserException;
import com.example.demo.model.Mregister;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
@Service
public class UserBusiness {

    @Autowired
    private UserService userService;

    //connect and get to database mysql
    public User register(Mregister request) throws Baseexception {

       User user = userService.createUser(request.getEmail(), request.getUsername() , request.getPassword());
        return user;
    }

    public String uploadFilepicture(MultipartFile file) throws FileUploadException {

        //validate file
        if (file == null){
            //throw error
            throw  FileUploadException.fileNull();
        }

        //validate size
        if (file.getSize() > 1048576 *2 ){
            //throw error
            throw FileUploadException.fileMaxSize();
        }

        //check file is a picture?
        String contentType =   file.getContentType();
        if (contentType == null ){
            //specify throw error
            throw FileUploadException.unsupported();
        }
        List<String> typeSupportUpload = Arrays.asList("image/jpeg", "image/png");
        if (!typeSupportUpload.contains(contentType)){
            //throw error (unsupport)
            throw FileUploadException.unsupported();
        }

        //and file upload is correct with anything use this file
        try {
            byte[] bytesup = file.getBytes();    //up to server as a aws file storage
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}
