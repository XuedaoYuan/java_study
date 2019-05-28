package com.tmall.xdyuan.mapper;

import com.tmall.xdyuan.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    public List<Category> getCategoryList();
}
