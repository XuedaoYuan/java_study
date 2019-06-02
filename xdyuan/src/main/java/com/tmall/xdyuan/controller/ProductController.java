package com.tmall.xdyuan.controller;

import com.tmall.xdyuan.mapper.ProductMapper;
import com.tmall.xdyuan.pojo.Product;
import com.tmall.xdyuan.utils.Msg;
import com.tmall.xdyuan.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.sql.Timestamp;

@RestController
public class ProductController {
    @Autowired
    ProductMapper productMapper;

    @GetMapping("/product-cid")
    public Msg handleGetProductListByCid(@RequestParam int cid) throws Exception {
        List<Product> ps = productMapper.getProductListByCid(cid);
        return ResultUtil.success(ps);
    }

    @GetMapping("/product-id")
    public Msg handleGetProductById(@RequestParam int id) throws Exception {
        Product p = productMapper.getProductById(id);
        return ResultUtil.success(p);
    }

    @PostMapping("/product")
    public Msg addProduct(@RequestBody Product product) throws Exception {
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        product.setCreateDate(ts);
        productMapper.addProduct(product);
        return ResultUtil.success(ts);
    }

    @PutMapping("/product")
    public Msg updateProduct(@RequestBody Product product) throws Exception {
        productMapper.updateProduct(product);
        return ResultUtil.success();
    }

    @DeleteMapping("/product")
    public Msg deleteProduct(@RequestParam int id) throws Exception {
        productMapper.deleteProduct(id);
        return ResultUtil.success("删除成功");
    }

}
