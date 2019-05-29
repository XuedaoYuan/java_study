package com.tmall.xdyuan.mapper;

import com.tmall.xdyuan.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    public List<Category> getCategoryList();

    public Category getCategoryById(int id);

    public void addCategory(Category category);

    public void deleteCategory(int id);

    public void updateCategory(Category category);
}
