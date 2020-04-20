package com.example.demo;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/4/20 18:28
 * @version: v1.0
 * @modified By:
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/show")
    public String showInfo() {
        return "hello,this is jenkins demo";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello....";
    }

    @GetMapping("/new")
    public String newFeature() {
        return "new feature...";
    }

}

