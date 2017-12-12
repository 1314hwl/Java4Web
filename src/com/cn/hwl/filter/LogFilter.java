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
        System.out.println("��ʼ����...");
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println("filter �Ѿ���ȡ���û�����ĵ�ַ��" + httpServletRequest.getServletPath());
        chain.doFilter(request, response);
        long after = System.currentTimeMillis();
        System.out.println("���˽���");
        System.out.println("���󱻶�λ����" + ((HttpServletRequest) request).getRequestURI() + "  ������ʱ��Ϊ��" + (after - before));
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        mFilterConfig = config;

    }

}
