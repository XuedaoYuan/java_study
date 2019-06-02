package com.tmall.xdyuan.controller;

import com.tmall.xdyuan.mapper.ProductImageMapper;
import com.tmall.xdyuan.pojo.ProductImage;
import com.tmall.xdyuan.utils.Msg;
import com.tmall.xdyuan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductImageController {
    @Autowired
    ProductImageMapper productImageMapper;

    @GetMapping("/productimage-pid")
    public Msg handleGetImageList(@RequestParam int pid) throws Exception{
        List<ProductImage> pis = productImageMapper.getImageListByPid(pid);
        return ResultUtil.success(pis);
    }

    @GetMapping("/productimage-id")
    public Msg handleGetImage(@RequestParam int id) throws Exception{
        ProductImage pi = productImageMapper.getImageById(id);
        return ResultUtil.success(pi);
    }

    @PostMapping("/productimage")
    public Msg addProductimage(@RequestBody ProductImage productImage) throws Exception {
        productImageMapper.addProductImage(productImage);
        int id = productImage.getId();
        return ResultUtil.success(id);
    }

    @PutMapping("/productimage")
    public Msg updateProductimage(@RequestBody ProductImage productImage) throws Exception {
        productImageMapper.updateProductImage(productImage);
        return ResultUtil.success();
    }

    @DeleteMapping("/productimage")
    public Msg deleteProductimage(@RequestParam int id) throws Exception {
        productImageMapper.deleteProductImage(id);
        return ResultUtil.success();
    }
}
