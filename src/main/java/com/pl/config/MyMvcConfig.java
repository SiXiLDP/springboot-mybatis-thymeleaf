package com.pl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("main");
    }

    //自定义国际化组件生效，实现登录页面的中文英语切换
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }



    //登录拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {//把自己写得拦截器加载进来，但是addPathPatterns("/**")会拦截所有请求，所以要放行相应的请求
        registry.addInterceptor(new LoginHandleInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/index.html","/","/user/login","/css/*","/imgs/**","/js/**","/vendor/**");
    }
}

