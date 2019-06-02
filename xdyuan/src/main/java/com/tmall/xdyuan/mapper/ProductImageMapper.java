package com.tmall.xdyuan.mapper;

import com.tmall.xdyuan.pojo.ProductImage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductImageMapper {

    public List<ProductImage> getImageListByPid(int pid);

    public ProductImage getImageById(int id);

    public void addProductImage(ProductImage productImage);

    public void updateProductImage(ProductImage productImage);

    public void deleteProductImage(int id);
}
