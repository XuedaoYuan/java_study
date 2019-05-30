package com.tmall.xdyuan.controller;

import com.tmall.xdyuan.mapper.PropertyMapper;
import com.tmall.xdyuan.pojo.Property;
import com.tmall.xdyuan.utils.Msg;
import com.tmall.xdyuan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropertyController {
    @Autowired
    PropertyMapper propertyMapper;

    @GetMapping("/propertyList")
    public Msg getPropertyListByCid(@RequestParam int cid) throws Exception {
        List<Property> ps = propertyMapper.getPropertyListByCid(cid);
        return ResultUtil.success(ps);
    }

    @GetMapping("/property-id")
    public Msg getPropertyById(@RequestParam int id) throws Exception {
        Property p = propertyMapper.getPropertyById(id);
        return ResultUtil.success(p);
    }

    @PostMapping("/property")
    public Msg addProperty(@RequestBody Property property) throws Exception {
        propertyMapper.addProperty(property);
        int id = property.getId();
        return ResultUtil.success(property);
    }

    @PutMapping("/property")
    public Msg updateProperty(@RequestBody Property property) throws Exception {
        propertyMapper.updateProperty(property);
        return ResultUtil.success();
    }

    @DeleteMapping("/property")
    public Msg deleteProperty(@RequestParam int id) throws Exception {
        propertyMapper.deleteProperty(id);
        return ResultUtil.success();
    }

}
