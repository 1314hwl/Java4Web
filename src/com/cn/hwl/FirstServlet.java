package com.cn.hwl;

import java.io.IOException;
import java.io.PrintStream;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "firstServlet", urlPatterns = { "/firstServlet" })
public class FirstServlet extends HttpServlet {

    // �ͻ��˵���Ӧ������ʹ�ø÷���������Ӧ�ͻ����������͵�����
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // ���ý��뷽ʽ
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charSet=UTF");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String[] colors = request.getParameterValues("color");
        String country = request.getParameter("country");
        PrintStream out = new PrintStream(response.getOutputStream());
        // ���html
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet����</title>");
        out.println("<body>");
        // ����
        out.println("��������:" + name + "<hr/>");
        out.println("�����Ա�:" + gender + "<hr/>");
        out.println("��ϲ������ɫ:");
        for (String c : colors) {
            out.println(c);
        }
        out.println("<hr/>");
        out.println("�����ԵĹ���:" + country + "<hr/>");
        out.println("</body>");
        out.println("</head>");
        out.println("</html>");
    }
}
