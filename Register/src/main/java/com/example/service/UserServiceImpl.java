package com.example.service;

import com.example.dao.UserMapper;
import com.example.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

//业务逻辑层->implement实体Service->导入对应方法get实体名->对接口方法化（public）->return 实体Mapper.get属性(通过改变的属性）
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;


    @Override
    public List<Users> getUser(int age) {
        return userMapper.getUser(age);
    }
}
