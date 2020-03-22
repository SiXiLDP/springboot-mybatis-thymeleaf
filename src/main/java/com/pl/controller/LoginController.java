package com.pl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    //登录验证
    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session
    ){//为了方便，这里的username和password直接在这里定义，
        // 没有从数据库读取，当然会了增删改查这里也是很容易的
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            session.setAttribute("LoginUser",username);
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","登录失败");
            return "index";
        }

    }

    //注销登录
    @RequestMapping("/user/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "index";
    }
}
