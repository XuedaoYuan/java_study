package com.tmall.xdyuan.mapper;

import com.tmall.xdyuan.pojo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    public List<Product> getProductListByCid(int cid);

    public Product getProductById(int id);

    public void addProduct(Product product);

    public void updateProduct(Product product);

    public void deleteProduct(int id);
}
