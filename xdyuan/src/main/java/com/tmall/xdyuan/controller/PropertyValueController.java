package com.tmall.xdyuan.controller;


import com.tmall.xdyuan.mapper.ProductMapper;
import com.tmall.xdyuan.mapper.PropertyMapper;
import com.tmall.xdyuan.mapper.PropertyValueMapper;
import com.tmall.xdyuan.pojo.Product;
import com.tmall.xdyuan.pojo.Property;
import com.tmall.xdyuan.pojo.PropertyValue;
import com.tmall.xdyuan.utils.Msg;
import com.tmall.xdyuan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PropertyValueController {
    @Autowired
    PropertyValueMapper propertyValueMapper;

    @Autowired
    PropertyMapper propertyMapper;

    @Autowired
    ProductMapper productMapper;

    public void init(Product product) {
        List<Property> pts = propertyMapper.getPropertyListByCid(product.getCid());
        for (Property pt : pts) {
            Map<String, Object> map = new HashMap<>();
            map.put("pid", product.getId());
            map.put("ptid", pt.getId());
            PropertyValue pv = propertyValueMapper.getPvByPidAndPtid(map);
            if (null == pv) {
                pv = new PropertyValue();
                pv.setPid(product.getId());
                pv.setPtid(pt.getId());
                propertyValueMapper.insertPropertyValue(pv);
            }
        }
    }

    @GetMapping("/property-value-pid-ptid")
    public Msg getPvByPidAndPtid(@RequestParam Integer pid, @RequestParam Integer ptid) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("pid", pid);
        map.put("ptid", ptid);
        PropertyValue pv = propertyValueMapper.getPvByPidAndPtid(map);
        return ResultUtil.success(pv);
    }

    @GetMapping("/edit-pv")
    public Msg editPv(@RequestParam Integer pid) throws Exception {
        Product product = productMapper.getProductById(pid);
        this.init(product);
        List<PropertyValue> pvs = propertyValueMapper.getPvListByPid(product.getId());
        for(PropertyValue pv : pvs){
            Property pt = propertyMapper.getPropertyById(pv.getPtid());
            pv.setProperty(pt);
        }
        return ResultUtil.success(pvs);

    }

    @PostMapping("/update-pv")
    public Msg updatePv(@RequestBody PropertyValue propertyValue) throws Exception {
        propertyValueMapper.updatePropertyValue(propertyValue);
        return ResultUtil.success();
    }
}
