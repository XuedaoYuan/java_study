package com.tmall.xdyuan.mapper;

import com.tmall.xdyuan.pojo.PropertyValue;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PropertyValueMapper {

    public PropertyValue getPvByPidAndPtid(Map<String, Object> params);

    public void updatePropertyValue(PropertyValue propertyValue);

    public void insertPropertyValue(PropertyValue propertyValue);

    public List<PropertyValue> getPvListByPid(Integer pid);
}
