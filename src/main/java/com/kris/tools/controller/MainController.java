package com.kris.tools.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 项目主服务
 * @Author: KRIS
 * @Date: 2020/5/2
 **/
@RestController
@RequestMapping("/tools")
public class MainController {

    @RequestMapping("/home")
    public String main(){
        return "Hello World !";
    }
}
