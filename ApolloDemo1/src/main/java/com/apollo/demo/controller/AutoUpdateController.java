package com.apollo.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("apollo")
public class AutoUpdateController {

    @Value("${test:lisi}")
    public  String name;

    @RequestMapping("name")
     public String getName() {
        return "当前使用人的名字是：" + name;
    }
}
