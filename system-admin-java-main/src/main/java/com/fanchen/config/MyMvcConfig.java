package com.fanchen.config;/*
Created by shkstart on 2020/2/23.
*/

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    //静态资源释放
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //window下需要映射绝对路径，
        registry.addResourceHandler("/img/2021/12/**")
                .addResourceLocations("file:" + "E:\\educationProject\\疫情信息管理系统\\vue\\yiqing\\system-admin-java-main\\src\\main\\resources\\static\\img\\2021\\12\\");
        registry.addResourceHandler("/img/2022/08/**")
                .addResourceLocations("file:" + "E:\\educationProject\\疫情信息管理系统\\vue\\yiqing\\system-admin-java-main\\src\\main\\resources\\static\\img\\2022\\8\\");
        /*registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/static/");*/
    }

}
