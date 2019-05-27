package com.how3java.springboot.web;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how3java.springboot.mapper.CategoryMapper;
import com.how3java.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryMapper categoryMapper;

    @RequestMapping("/list-category")
    public String listCategory(
            @RequestParam(value = "start", defaultValue = "0") int start,
            @RequestParam(value = "size", defaultValue = "5") int size
    ) throws Exception {
        PageHelper.offsetPage(start, size, "id desc");
        List<Category> cs = categoryMapper.listAll();
        PageInfo<Category> pageInfo = new PageInfo<>(cs);
        long pages = pageInfo.getPages();
        long total = pageInfo.getTotal();
        HashMap<String, Object> resultMap = new HashMap<>();
        resultMap.put("pages", pages);
        resultMap.put("total", total);
        resultMap.put("list", cs);
        return JSON.toJSONString(resultMap);
    }

    @PostMapping("/categories")
    public String save(@RequestBody Category category) throws Exception {
        System.out.println(category.getName());
        categoryMapper.save(category);
        return "Success";
    }

    @RequestMapping("/delete-category")
    public String deleteCategory(Category c) throws Exception {
        categoryMapper.delete(c.getId());
        return "redirect:listCategory";
    }

    @RequestMapping("/updateCategory")
    public String updateCategory(Category c) throws Exception {
        categoryMapper.update(c);
        return "redirect:listCategory";
    }

    @GetMapping("/categroies/{id}")
    public String listCategory(@PathVariable("id") int id) throws Exception {
        Category c = categoryMapper.get(id);
        return JSON.toJSONString(c);
    }
}
