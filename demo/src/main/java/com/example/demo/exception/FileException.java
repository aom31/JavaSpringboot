package com.example.demo.exception;

public class FileException extends BaseException{

    public FileException(String codeErr) {
        super(codeErr);
    }

    public static FileException fileNull(){
        return  new FileException("null.file");
    }
    public static FileException fileMaxSize(){
        return  new FileException("file.max.size");
    }
    public static FileException unsupportType(){
        return  new FileException("file.unsupport.type");
    }


}
