package com.qinan.mySpringMVC.service.impl;

import com.qinan.mySpringMVC.dao.IUserDao;
import com.qinan.mySpringMVC.model.User;
import com.qinan.mySpringMVC.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by qinan on 2017/1/9.
 */
@Service("userService")
    public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectbyId(Integer id){
        return this.userDao.selectbyId(id);
    }

    public String selectbyPhoneNumber(String phone_no){
        return this.userDao.selectbyPhoneNumber(phone_no);
    }
}
