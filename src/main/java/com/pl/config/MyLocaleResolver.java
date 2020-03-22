package com.pl.config;


import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


public class MyLocaleResolver implements LocaleResolver {

    //解析请求
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的参数
        String lang =request.getParameter("l");

        Locale locale=Locale.getDefault();//如果没有参数,为默认的

        //如果请求携带了国际化参数
        if(!StringUtils.isEmpty(lang)){
            //zh_CN
            String [] split=lang.split("_");
            //国家，地区
            locale=new Locale(split[0],split[1]);

        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}

