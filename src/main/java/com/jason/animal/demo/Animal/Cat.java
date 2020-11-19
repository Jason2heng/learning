package com.jason.animal.demo.Animal;

public class Cat extends  Animal{
    private double werght;//猫的体重
    public Cat(){
        this.temp=12;

    }

    public double getWerght() {
        return werght;
    }

    public void setWerght(double werght) {
        this.werght = werght;
    }
    public void run(){
        System.out.println(this.getName()+"是一只"+this.getSpecies()+"，会跑就多跑一点");
    }
}
