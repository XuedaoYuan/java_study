package com.tmall.xdyuan.mapper;

import com.tmall.xdyuan.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> getUserList();
}
