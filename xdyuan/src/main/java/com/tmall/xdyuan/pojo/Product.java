package com.tmall.xdyuan.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class Product {

    private Integer id;
    private String name;
    private String subTitle;
    private float originalPrice;
    private float promotePrice;
    /*库存*/
    private Integer stock;
    /*类别 id*/
    private Integer cid;
    /*创建时间*/
    private Timestamp createDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public float getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(float originalPrice) {
        this.originalPrice = originalPrice;
    }

    public float getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(float promotePrice) {
        this.promotePrice = promotePrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCid() {
        return cid;
    }


}
