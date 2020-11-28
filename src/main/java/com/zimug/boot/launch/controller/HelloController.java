package com.zimug.boot.launch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liu
 * @date 2020/11/28 17:22:41
 * @description
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String hello(String name){
        return "hello world, " + name;
    }
}
