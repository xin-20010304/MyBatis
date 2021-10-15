package com.example.mybatis.mapper;


import com.example.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {

    User Sel(int id);
}
