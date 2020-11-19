package com.jason.animal.demo.Animal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@ResponseBody
public class Animal {
  /**

  * @Description:     private只允许在本类中进行访问
   * pulic允许任意位置访问
   * protected:允许当前类，同包子类，挎包子类调用，挎包非子类不允许
   * 默认：允许在当前类，同包子类调用正常，挎包子类不允许调用
  * @Author:        叫兽

  */
    private String name;//名字
    private int month;//月份
    private String species;//品种
    public int temp=15;
    public Animal(){

    }
    public Animal(String name,int month,String species){
        this.setName(name);
        this.setMonth(month);
        this.setSpecies(species);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    public void eat(){
        System.out.println(this.getName()+"会吃你就多吃点");
    }
    public void eat(String name){
        System.out.println(this.getName()+"很想喝奶茶");
    }
}
