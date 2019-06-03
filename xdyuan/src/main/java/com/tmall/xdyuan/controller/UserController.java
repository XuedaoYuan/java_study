package com.tmall.xdyuan.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmall.xdyuan.mapper.UserMapper;
import com.tmall.xdyuan.pojo.User;
import com.tmall.xdyuan.utils.Msg;
import com.tmall.xdyuan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/user")
    public Msg getUserList(
            @RequestParam(value = "index", defaultValue = "1") int index,
            @RequestParam(value = "pageSize", defaultValue = "5") int pageSize
    ) throws Exception {
        PageHelper.startPage(index, pageSize, "id asc");
        List<User> users = userMapper.getUserList();
        PageInfo<User> page = new PageInfo<>(users);
        HashMap<String, Object> result = new HashMap<>();
        result.put("list", page.getList());
        result.put("total", page.getTotal());
        result.put("index", page.getPageNum());
        result.put("pageSize", page.getPageSize());
        return ResultUtil.success(result);
    }
}
