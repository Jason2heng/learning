package com.pads.myspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@ResponseBody

public class Cat {
    private String name;
    private int month;
    private double weight;
    private String specise;
    private int price;
    public Cat(){
        System.out.println("这是我的自我介绍");
    }
    public void setName(String name){
        this.name=name;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMonth() {
        return month;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecise() {
        return specise;
    }

    public void setSpecise(String specise) {
        this.specise = specise;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getName() {
        return "我是一只叫做"+this.name+"猫咪";
    }

    public Cat(String name){
        System.out.println("这是一个无参返回");
    }
//    public Cat(String newName,int newMonth,double newWeight,String newSpecise){
//        this("aaa");
//        name=newName;
//        month=newMonth;
//        weight=newWeight;
//        specise=newSpecise;
//
    public void run(){
        int temp=12;
        System.out.println("小猫快跑,temp="+temp);
    }
    public void run(String nanme){
        System.out.println(nanme+"真棒");
    }
    public void eat() {
        System.out.println("小猫吃鱼");
    }
}
