package com.ceshi.pojo;

public class Girl {
    private int id;
    private String name;
    private int pid;
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + ", pid = " + pid;
    }
}
