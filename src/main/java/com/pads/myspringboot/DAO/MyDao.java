package com.pads.myspringboot.DAO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyDao {
    public void pads(){
        System.out.println("hello word");
    }


}
