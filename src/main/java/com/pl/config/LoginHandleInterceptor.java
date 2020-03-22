package com.pl.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登录拦截器
public class LoginHandleInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //首先获取session中的LoginUser
        Object loginUser=  request.getSession().getAttribute("LoginUser");


        //判断是否为空，为空跳转到登录页面，并返回一个提示信息
        if(loginUser==null){
            request.setAttribute("msg","无法进入，请先登录！");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }
        else {
            return true;
        }
    }
}
