package com.cn.hwl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * filter作用：项目中常常用作<br>
 * 1.拦截客户端的请求<br>
 * 2.权限控制<br>
 * 3.记录日志<br>
 * 4.验证用户是否登录<br>
 * 
 * 
 * @Description
 * @author Hero
 * @date 2017年12月18日 下午10:14:41
 */
@WebFilter(filterName = "/authority", urlPatterns = "/*", initParams = {
        @WebInitParam(name = "encoding", value = "UTF-8"), @WebInitParam(name = "loginPage", value = "/login.jsp") })
public class AuthorityFilter implements Filter {

    private FilterConfig config;

    @Override
    public void init(FilterConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
//        String encoding = config.getInitParameter("encoding");
//        String loginPage = config.getInitParameter("loginPage");
//        req.setCharacterEncoding(encoding);
//        HttpServletRequest request = (HttpServletRequest) req;
//        HttpSession session = request.getSession(true);
//        String requestPath = request.getServletPath();
//        if (session.getAttribute("user") == null && !requestPath.endsWith(loginPage)) {
//            req.setAttribute("err", "请先登录!");
//            req.getRequestDispatcher(loginPage).forward(req, resp);
//        } else {
//            chain.doFilter(req, resp);
//        }
        
        chain.doFilter(req, resp);
    }

    @Override
    public void destroy() {
        config = null;
    }

}
