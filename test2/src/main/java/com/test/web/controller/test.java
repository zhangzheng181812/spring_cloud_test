package com.test.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/3/23.
 */
@RestController
public class test {

    @RequestMapping("/test1")
    public String test(){
        return "hello word!";
    }
}
