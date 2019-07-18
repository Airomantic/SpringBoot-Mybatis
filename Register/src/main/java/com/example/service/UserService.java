package com.example.service;

import com.example.pojo.Users;

import java.util.List;
//业务逻辑层->对应Mapper的接口
public interface UserService {
    List<Users> getUser(int age);
}
