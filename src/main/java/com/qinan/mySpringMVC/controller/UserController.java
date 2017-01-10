package com.qinan.mySpringMVC.controller;

import com.qinan.mySpringMVC.model.User;
import com.qinan.mySpringMVC.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by qinan on 2017/1/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    IUserService userService;

    @RequestMapping(value="/showUser",method= RequestMethod.GET)
    public String toIndex(HttpServletRequest request,Model model){
        int id = Integer.parseInt(request.getParameter("id"));
        User user=this.userService.selectbyId(id);
        model.addAttribute("user",user);
//        System.out.println("OK");
        return "showUser";
    }
}
