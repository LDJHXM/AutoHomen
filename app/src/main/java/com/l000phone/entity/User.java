package com.l000phone.entity;

/**
 * Created by Administrator on 2016/11/21.
 */

public class User {
    private int id;
    private String Name;
    private String Pwd;

    public User() {
    }

    public User(int id, String name, String pwd) {
        this.id = id;
        Name = name;
        Pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }
}
