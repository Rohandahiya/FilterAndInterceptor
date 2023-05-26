package com.example.Filter.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.logging.LogRecord;

public class ApplicationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        System.out.println("This is before sending to controllers");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("This is after sending to controllers");

    }
}
