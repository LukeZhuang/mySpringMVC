package com.qinan.mySpringMVC.dao;

import com.qinan.mySpringMVC.model.User;

/**
 * Created by qinan on 2017/1/9.
 */
public interface IUserDao {
    User selectbyId(Integer id);
    String selectbyPhoneNumber(String phone_no);
}
