package com.example.test.controller;

import com.example.test.bean.UBean;
import com.example.test.service.UService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class LController {

    @Resource
    private UService uService;
    @RequestMapping("/log")
    public String show(){
        return "log";
    }
    @RequestMapping("/loginI")
    public String login(String name,String password){
        UBean uBean=uService.loginIn(name, password);
        if (uBean!=null){
            return "success";
        }else {
            return "error";
        }

    }




}
