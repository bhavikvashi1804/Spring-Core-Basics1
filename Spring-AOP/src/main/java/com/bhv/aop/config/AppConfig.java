package com.bhv.aop.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan(basePackages = "com.bhv.aop")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    String appName(){
        return "Spring AOP Demo";
    }
}
