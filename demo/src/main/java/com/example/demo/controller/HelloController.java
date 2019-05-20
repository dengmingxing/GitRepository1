package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Anthor:liyunfeng
 * @CreateDate: 2019/5/17 16:34
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String hello(){
        return  "hello loggger";
    }
}
