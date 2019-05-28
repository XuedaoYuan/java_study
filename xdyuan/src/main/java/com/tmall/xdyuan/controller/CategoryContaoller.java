package com.tmall.xdyuan.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmall.xdyuan.mapper.CategoryMapper;
import com.tmall.xdyuan.pojo.Category;
import com.tmall.xdyuan.utils.Msg;
import com.tmall.xdyuan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class CategoryContaoller {
    @Autowired
    CategoryMapper categoryMapper;

    @GetMapping("/category")
    public Msg getCategoryList(
            @RequestParam(value = "start", defaultValue = "0") int start,
            @RequestParam(value = "limit", defaultValue = "5") int limit
    ) {
        PageHelper.startPage(start, limit, "id asc");
        List<Category> cs = categoryMapper.getCategoryList();
        PageInfo<Category> page = new PageInfo<>(cs);
        HashMap<String, Object> result = new HashMap<>();
        result.put("list", page.getList());
        result.put("total", page.getTotal());
        result.put("index", page.getPageNum());
        result.put("pageSize", page.getPageSize());
        return ResultUtil.success(result);
    }
}
