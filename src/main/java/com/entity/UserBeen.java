package com.entity;

import java.io.Serializable;

public class UserBeen implements Serializable{

    private  String user;
    private  String pwd;

    public String getUser() {
        return user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public UserBeen(String user, String pwd) {
        this.user = user;
        this.pwd = pwd;
    }

    public UserBeen() {
    }

    @Override
    public String toString() {
        return "UserBeen{" +
                "user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
