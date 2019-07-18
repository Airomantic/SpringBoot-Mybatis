package com.example.dao;

import com.example.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//dao数据访问层->Mapper->操控数据库语言->List<pojo实体> get属性()
@Mapper
public interface UserMapper {
    //注意age前有个#
    @Select("SELECT * FROM users WHERE age=#{age}")
    List<Users> getUser(int age);
}
