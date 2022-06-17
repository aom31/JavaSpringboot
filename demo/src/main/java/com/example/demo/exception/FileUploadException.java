package com.example.demo.exception;

import java.io.File;

public class FileUploadException extends Baseexception {

    public FileUploadException (String code){
        super("file." +code);
    }

    public static FileUploadException fileNull(){
        return new FileUploadException("null");
    }

    public static FileUploadException fileMaxSize() {
        return new FileUploadException("max.size");
    }

    public static FileUploadException unsupported(){
        return new FileUploadException("unsupported.file.type");

    }
}
