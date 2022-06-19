package com.example.demo.business;

import com.example.demo.exception.FileException;
import com.example.demo.exception.UserException;
import com.example.demo.model.MRegisterResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class TestapiBusiness {

    public String register(MRegisterResponse mRegisterResponseRequest) throws UserException {
        //request null validate
        if( mRegisterResponseRequest == null){
            throw UserException.requestNull();
        }

        //validate email
        if (Objects.isNull(mRegisterResponseRequest.getEmail())){
            throw UserException.emailNull();
        }
        return "";

    }

    //upload picture
    public String uploadProfilePicture( MultipartFile file) throws FileException {
        //check file null?
        if (file == null) {
            //throw error
            throw FileException.fileNull();
        }
        //check size file validate
        if (file.getSize() > 2 * 1048576) {
            //throw error
            throw FileException.fileMaxSize();
        }

        //validate type upload
        //check define content type
        String contentType = file.getContentType();

        if (contentType == null) {
            //throw error
            throw FileException.unsupportType();
        }
        // check content type have it is support?
        List<String> supportedType = Arrays.asList("image/jpeg", "image/png");
        if (supportedType.contains(contentType)) {
            //throw error not support
            throw FileException.unsupportType();
        }
        //upload file to database or server
        try {
            byte[] bytes = file.getBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contentType;
    }
}
