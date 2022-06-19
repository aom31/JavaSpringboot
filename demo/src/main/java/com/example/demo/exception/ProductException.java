package com.example.demo.exception;

public class ProductException extends BaseException {
    public ProductException(String codeErr) {
        super("product"+codeErr);
    }

    //send id but it not have in database
    public static ProductException notFound(){
        return new ProductException("not.found");
    }
}
