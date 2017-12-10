package com.cn.hwl;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 1.对应servlet中from.jsp<br>
 * servlet3.0的配置,两种方式:<br>
 * 1.在servlet类中使用@WebServlet注解进行配置<br>
 * 2.通过在web.xml文件中进行配置<br>
 * 如果使用注解配置servlet,有两点需要指出：<br>
 * 1.不要在web.xml文件的根元素(<web-app.../>)中指定metadata-complete="true"。<br>
 * 2.不要在web.xml文件中配置该servlet。<br>
 * 如果打算使用web.xml文件来配置该Servlet,则需要配置如下两个部分：<br>
 * 1.配置servlet的名字：对应web.xml文件中的<servlet/>元素。<br>
 * 2.配置servlet的url:对应web.xml文件中的<servlet-mapping/>元素。这一步是可选的。但如果没有为Servlet配置url，则该Servlet不能响应用户请求。
 * 
 * 
 * @Description
 * @author Hero
 * @date 2017年12月10日 下午9:35:04
 */
@WebServlet(name = "formServlet", urlPatterns = { "/form" })
public class FormServlet extends HttpServlet {

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
