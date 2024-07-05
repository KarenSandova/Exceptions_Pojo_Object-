package com.example.pojo;

public class CustomException extends Exception{
    public static final long serialVersionUID =700l;
    public CustomException(String mensaje){
        super (mensaje);
    }

}
