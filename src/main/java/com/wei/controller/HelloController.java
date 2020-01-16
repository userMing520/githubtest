package com.wei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2020/1/16  10:16
 * @Description: TODO
 */
@RestController
public class HelloController {

    @RequestMapping("info")
    public String info() {
        return "hello!springboot";
    }
}
