package com.stackroute;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

    @Configuration
    @ComponentScan(basePackages = "com.stackroute")
    @EnableWebMvc
    public class UserConfig {

        @Bean
        public ViewResolver  viewResolver(){
            InternalResourceViewResolver resolver= new InternalResourceViewResolver("/",".jsp");
            return resolver;
        }
    }
