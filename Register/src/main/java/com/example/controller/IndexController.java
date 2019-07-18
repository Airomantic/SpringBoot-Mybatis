package com.example.controller;

import com.example.pojo.Users;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Controller
@RestController
public class IndexController {

    //api
    //注入实体Service->申请业务逻辑对象->@GetMapping->引入方法get属性()
    @Autowired
    UserService userService;

    @GetMapping("/show")
    public List<Users> getUsers(int age) {
        return userService.getUser(age);
    }
    @RequestMapping("/index")
   // @ResponseBody
    public Map<String,String> index(){
        Map map = new HashMap<String, String>();
        map.put("北京", "北京联合大学");
        map.put("深圳", "深圳大学");
        return map;
    }

}
