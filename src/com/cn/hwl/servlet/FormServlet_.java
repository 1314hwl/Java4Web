package com.cn.hwl.servlet;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet_
 */
@WebServlet(name = "formServlet", urlPatterns = { "/formServlet" })
public class FormServlet_ extends HttpServlet {
    // 客户端的响应方法，使用该方法可以响应客户端所有类型的请求
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // 设置解码方式
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charSet=UTF");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String[] colors = request.getParameterValues("color");
        String country = request.getParameter("country");
        PrintStream out = new PrintStream(response.getOutputStream());
        // 输出html
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet测试</title>");
        out.println("<body>");
        // 内容
        out.println("您的名字:" + name + "<hr/>");
        out.println("您的性别:" + gender + "<hr/>");
        out.println("您喜欢的颜色:");
        for (String c : colors) {
            out.println(c);
        }
        out.println("<hr/>");
        out.println("您来自的国家:" + country + "<hr/>");
        out.println("</body>");
        out.println("</head>");
        out.println("</html>");
    }

}
