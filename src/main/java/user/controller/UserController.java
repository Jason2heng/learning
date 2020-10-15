package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import user.entity.UserEntity;
import user.service.UserService;

import java.util.List;
import java.util.Map;

/**

* Restconller

* @Author:叫兽
 * @ResponseBody
 * @Controller

*/
@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getAll")
    public List<UserEntity>getAll(Map map){
        return userService.getAll(map);


    }
    @RequestMapping("/delById")
    public String delById(Integer id) {

        userService.delById(id);
        return "redirect:/index.html";
    }

    // 保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {

        System.out.println("用户注册 - " + userEntity.toString());
        userService.save(userEntity);
        return "success";
    }
}



