package com.example.pojo;

public class Main {
    public static void main(String[] args){
        System.out.println("How do you feel");

        MyDto bob = new MyDto.MyDtoBuilder().setAge(19).setName("Karen").createMyDto();
    }
}
