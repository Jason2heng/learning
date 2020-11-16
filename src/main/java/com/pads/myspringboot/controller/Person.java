package com.pads.myspringboot.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {
    private String name;
    private int age;
    public Person(){
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;

    }
    public void setName(String name){
        if (name.length()>6||name.length()<2){
            System.out.println("你输入的规格不服就和要求");
            return;
        }
        else {
            this.name=name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        if (age>100||age<0){
            System.out.println("你设置的年龄不符合标准");
            return;
        }
        else {
            this.age=age;

        }
    }

    public int getAge() {
        return age;
    }
}
