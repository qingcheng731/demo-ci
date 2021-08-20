package com.example.democi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzc
 */
@RestController
public class Index {

    @GetMapping("/index")
    public Object index() {
        return "index";
    }
}
