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
 * filter���ã���Ŀ�г�������<br>
 * 1.���ؿͻ��˵�����<br>
 * 2.Ȩ�޿���<br>
 * 3.��¼��־<br>
 * 4.��֤�û��Ƿ��¼<br>
 * 
 * 
 * @Description
 * @author Hero
 * @date 2017��12��18�� ����10:14:41
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
//            req.setAttribute("err", "���ȵ�¼!");
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
