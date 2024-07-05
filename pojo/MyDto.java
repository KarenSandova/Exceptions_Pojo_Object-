package com.example.pojo;

import java.util.List;

public class MyDto {
    private String name;
    private Integer age;
    private List<MyDto> friends;

    private MyDto(String name, Integer age, List<MyDto> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }
    public static class MyDtoBuilder {
        private String name;
        private Integer age;
        private List<MyDto> friends;

        public MyDtoBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MyDtoBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public MyDtoBuilder setFriends(List<MyDto> friends) {
            this.friends = friends;
            return this;
        }

        public MyDto createMyDto(){
            return new MyDto(name,age, friends);
        }
    }
}
