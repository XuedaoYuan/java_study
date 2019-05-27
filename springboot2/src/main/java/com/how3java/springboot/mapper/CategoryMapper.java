package com.how3java.springboot.mapper;

import com.how3java.springboot.pojo.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CategoryMapper {
    @Select("select * from category_")
    public List<Category> listAll();

    @Insert("insert into category_ (name) values (#{name})")
    public int save(Category category);

    @Delete("delete from category_ where id = #{id}")
    public void delete(int id);

    @Select("select * from category_ where id = #{id}")
    public Category get(int id);

    @Update("update category_ set name = #{name} where id=#{id}")
    public int update(Category category);
}
