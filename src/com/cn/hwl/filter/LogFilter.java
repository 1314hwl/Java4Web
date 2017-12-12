package com.cn.hwl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class LogFilter implements Filter {

    private FilterConfig mFilterConfig;

    @Override
    public void destroy() {
        mFilterConfig = null;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        ServletContext servletContext = this.mFilterConfig.getServletContext();
        long before = System.currentTimeMillis();
        System.out.println("开始过滤...");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println("filter 已经截取到用户请求的地址：" + httpServletRequest.getServletPath());
        chain.doFilter(request, response);
        long after = System.currentTimeMillis();
        System.out.println("过滤结束");
        System.out.println("请求被定位到：" + ((HttpServletRequest) request).getRequestURI() + "  所花的时间为：" + (after - before));
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        mFilterConfig = config;

    }

}
