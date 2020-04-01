package com.fff.springbootlearning.controller;

import com.fff.springbootlearning.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {

    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/hello")
    public @ResponseBody String hello(){
        return "hello";
    }

    @RequestMapping("/boot/config")
    public @ResponseBody String config(){
        return configInfo.getOwner_name();
    }
}
