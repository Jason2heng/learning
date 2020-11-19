package com.jason.animal.demo.Test;

import com.jason.animal.demo.Animal.Cat;
import com.jason.animal.demo.Animal.Dog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")

public class test {
    @RequestMapping("/URL")
    @ResponseBody
    public static void main(String[] args){
        Cat one=new Cat();
        /**

        * @Description:    java类作用描述子类可以调用父类的方法，但父类不能用子类独有的方法

        * @Author:        叫兽

        */
        one.setName("王力宏");
        one.setSpecies("中华田园猫");
        one.eat();
        one.run();
        System.out.println(one.temp);
        System.out.println("====================");
        Dog two=new Dog();
        two.setName("周杰伦");
        two.setSpecies("中华田园犬");
        two.setSex("公");
        two.eat();
        two.sleep();
        System.out.println("====================");
        two.eat("志达");
    }
}
