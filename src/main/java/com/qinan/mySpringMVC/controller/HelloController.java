package com.qinan.mySpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by qinan on 2017/1/9.
 */
@Controller
@RequestMapping("/a")
public class HelloController {
    public String toIndex(){
        return "Hello World!";
    }
}
