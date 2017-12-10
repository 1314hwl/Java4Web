package com.cn.hwl;

import java.io.IOException;
import java.io.PrintStream;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * 1.��Ӧservlet��from.jsp<br>
 * servlet3.0������,���ַ�ʽ:<br>
 * 1.��servlet����ʹ��@WebServletע���������<br>
 * 2.ͨ����web.xml�ļ��н�������<br>
 * ���ʹ��ע������servlet,��������Ҫָ����<br>
 * 1.��Ҫ��web.xml�ļ��ĸ�Ԫ��(<web-app.../>)��ָ��metadata-complete="true"��<br>
 * 2.��Ҫ��web.xml�ļ������ø�servlet��<br>
 * �������ʹ��web.xml�ļ������ø�Servlet,����Ҫ���������������֣�<br>
 * 1.����servlet�����֣���Ӧweb.xml�ļ��е�<servlet/>Ԫ�ء�<br>
 * 2.����servlet��url:��Ӧweb.xml�ļ��е�<servlet-mapping/>Ԫ�ء���һ���ǿ�ѡ�ġ������û��ΪServlet����url�����Servlet������Ӧ�û�����
 * 
 * 
 * @Description
 * @author Hero
 * @date 2017��12��10�� ����9:35:04
 */
@WebServlet(name = "formServlet", urlPatterns = { "/form" })
public class FormServlet extends HttpServlet {

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
