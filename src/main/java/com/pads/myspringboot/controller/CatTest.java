package com.pads.myspringboot.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/add")
public class CatTest {
   @RequestMapping("/URL")
   @ResponseBody
    public static void main( String[] ages){
        Cat one=new Cat();
       Cat two=new Cat();
        one.run();
        one.eat();
      one.setName("肉安");
       one.setMonth(80);
       one.setWeight(1000);
       one.setSpecise("中华田园猫");
       one.setPrice(250);
       System.out.println(one.getName()+"的价格为"+one.getPrice());
//       System.out.println("年龄:"+one.month);
//       System.out.println("体重:"+one.weight);
//       System.out.println("品种:"+one.specise);
//       one.run(one.name);
//       System.out.println("--------------------------");
       two.setName("叫兽");
       two.setMonth(90);
       two.setWeight(200);
       two.setSpecise("中华田园犬");
       two.setPrice(100000);
       System.out.println(two.getName()+"价格为"+two.getPrice());
//       System.out.println("年龄:"+two.month);
//       System.out.println("体重:"+two.weight);
//       System.out.println("品种:"+two.specise);
//       one.run(two.name);
//    }
//        @GetMapping("/age")
//    public String xiamao(@RequestParam String num){
//
//       return "HEELLO WORD"+num;
//       //select * from table where name=num;
//
//        }
//        @GetMapping("/DXADAQ")
//    public int xiamao1(@RequestParam int num) {
//
//        return  1227 +num;
//
//    }
//    @GetMapping("/DXAAQ")
//    public String xiamao2(@RequestParam int num) {
//         if (num%2==0){
//             return "hello wprd";
//         }
//         return "shibai";
   }
}