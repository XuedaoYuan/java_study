package com.tmall.xdyuan.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tmall.xdyuan.mapper.CategoryMapper;
import com.tmall.xdyuan.pojo.Category;
import com.tmall.xdyuan.utils.Msg;
import com.tmall.xdyuan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CategoryContaoller {
    @Autowired
    CategoryMapper categoryMapper;

    @GetMapping("/category-list")
    public Msg getCategoryList(
            @RequestParam(value = "index", defaultValue = "1") int index,
            @RequestParam(value = "pageSize", defaultValue = "5") int pageSize
    ) throws Exception {
        PageHelper.startPage(index, pageSize, "id asc");
        List<Category> cs = categoryMapper.getCategoryList();
        PageInfo<Category> page = new PageInfo<>(cs);
        HashMap<String, Object> result = new HashMap<>();
        result.put("list", page.getList());
        result.put("total", page.getTotal());
        result.put("index", page.getPageNum());
        result.put("pageSize", page.getPageSize());
        return ResultUtil.success(result);
    }

    @GetMapping("/category")
    public Msg getCategoryById(@RequestParam int id) throws Exception {
        Category c = categoryMapper.getCategoryById(id);
        return ResultUtil.success(c);
    }

    @PostMapping("/category")
    public Msg addCategory(@RequestBody Category category) throws Exception {
        categoryMapper.addCategory(category);
        int id = category.getId();
        return ResultUtil.success(id);
    }

    @DeleteMapping("/category")
    public Msg deleteCategory(@RequestParam int id) throws Exception {
        if(id == 0){
            return ResultUtil.error("必须传参数id");
        }
        categoryMapper.deleteCategory(id);
        return ResultUtil.success();
    }

    @PutMapping("/category")
    public Msg updateCategory(@RequestBody Category category) throws Exception {
        int id = category.getId();
        if(id == 0){
            return ResultUtil.error("必须传id");
        }
        categoryMapper.updateCategory(category);
        return ResultUtil.success();
    }
}
