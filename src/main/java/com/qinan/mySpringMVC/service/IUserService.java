package com.qinan.mySpringMVC.service;

import com.qinan.mySpringMVC.model.User;

/**
 * Created by qinan on 2017/1/9.
 */
public interface IUserService {
    User selectbyId(Integer id);
    String selectbyPhoneNumber(String phone_no);
}
