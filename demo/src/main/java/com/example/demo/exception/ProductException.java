package com.example.demo.exception;

public class ProductException extends Baseexception {

    public ProductException(String codeerr){
        super("product."+codeerr);
    }

    //user send product id but in database not have this id
    public static ProductException notFound(){
        return new ProductException("not.found");
    }
}
