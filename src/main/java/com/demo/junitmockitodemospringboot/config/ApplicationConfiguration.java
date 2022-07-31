package com.demo.junitmockitodemospringboot.config;

import com.demo.junitmockitodemospringboot.filter.RequestFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// *** Filter already implemented
//Implement h2
//Reactive programming
//Log4j

@Configuration
public class ApplicationConfiguration {

    @Bean
    public FilterRegistrationBean<RequestFilter> loggingFilter(){
        FilterRegistrationBean<RequestFilter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new RequestFilter());
        bean.addUrlPatterns("/employee/*");
        return bean;
    }
}
