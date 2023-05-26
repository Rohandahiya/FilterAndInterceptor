package com.example.Filter.configuration;

import com.example.Filter.filters.ApplicationFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {

    @Bean
    @Order(1)
    public FilterRegistrationBean<ApplicationFilter> filterCheck(){

        FilterRegistrationBean<ApplicationFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();

        filterFilterRegistrationBean.setFilter(new ApplicationFilter());
        filterFilterRegistrationBean.addUrlPatterns("/*");
        filterFilterRegistrationBean.setOrder(1);

        return filterFilterRegistrationBean;

    }
}
