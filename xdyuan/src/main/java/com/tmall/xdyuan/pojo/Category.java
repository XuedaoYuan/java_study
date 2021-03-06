package com.tmall.xdyuan.pojo;

public class Category {
    private int id;
    private String name;
    private String imageUrl;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + "]";
//        String.format("Category [id=%d, name=%s]", id, name);
    }
}
