package com.tmall.xdyuan.mapper;

import com.tmall.xdyuan.pojo.Property;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PropertyMapper {

    // 根据分类id获得属性列表
    public List<Property> getPropertyListByCid(int cid);

    public Property getPropertyById(int id);

    public void addProperty(Property property);

    public void updateProperty(Property property);

    public void deleteProperty(int id);
}
