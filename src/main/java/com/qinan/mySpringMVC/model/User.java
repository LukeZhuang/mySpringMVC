package com.qinan.mySpringMVC.model;

/**
 * Created by qinan on 2017/1/9.
 */
public class User {

    Integer id;
    String name;
    String phone_no;

    public User() {
        this.id=0;
        this.name="";
        this.phone_no="";
    }

    public User(String name, String phone_no) {
        this.name = name;
        this.phone_no = phone_no;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }
}
