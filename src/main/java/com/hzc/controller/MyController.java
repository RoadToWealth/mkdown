package com.hzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: HuangZhicheng
 * @Date: 2019/12/12 21:06
 * @Description: 测试公共方法
 */
@Controller
@RequestMapping("/myController")
public class MyController {

    @RequestMapping("/index")
    public String test(){
        return "index";
    }

    @RequestMapping("/page")
    public String pageIndex(HttpServletRequest request, HttpServletResponse response, Model model){
        StringBuilder builder=new StringBuilder();
        builder.append("<h1>你好<h1>");
        String content=builder.toString();
        model.addAttribute("content",content);
        return "page";
    }
}
