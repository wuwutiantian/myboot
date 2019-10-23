package com.config;

import com.interceptor.BaseInterceptor;
import com.interceptor.LoginInterceptor;
import com.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 */
@Configuration
public class MyConfig implements WebMvcConfigurer{
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*
        /index  :根路径
        /index/*:page路径下的所有
        /*:拦截/ 路径下的所有
        /**    拦截所有
         */




        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*");
        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/*");
    }
}
