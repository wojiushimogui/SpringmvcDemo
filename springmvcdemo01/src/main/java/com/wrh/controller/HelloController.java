package com.wrh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wuranghao on 2017/5/9.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/hello.do",method = RequestMethod.GET)
    public  String sayHello(){
        return "hello";
    }

}
