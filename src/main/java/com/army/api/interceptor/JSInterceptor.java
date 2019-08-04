package com.army.api.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JSInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "POST,GET,PUT,DELETE");
        response.addHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
        response.addHeader("Access-Control-Allow-Max-Age", "1728000");
        return true;
    }
}
