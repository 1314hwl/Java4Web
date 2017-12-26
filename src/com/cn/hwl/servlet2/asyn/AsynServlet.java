package com.cn.hwl.servlet2.asyn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsynServlet
 */
@WebServlet(urlPatterns = "/AsynServlet", asyncSupported = true)
public class AsynServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AsynServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<title>异步调用示例</title>");
        out.println("进入servlet的时间:"+new Date()+"<br>");
        AsyncContext actx=request.startAsync();
        actx.addListener(new MyAsyncListener());
        actx.setTimeout(60*1000);
        actx.start(new GetBookTartget(actx));
       
        out.println("结束servlet的时间:"+new Date()+"<br>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
    
    private class GetBookTartget implements Runnable{
        private AsyncContext actx=null;

         public GetBookTartget(AsyncContext actx) {
            this.actx=actx;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(5*1000);
                ServletRequest request=actx.getRequest();
                List<String>books=new ArrayList<>();
                books.add("hello jsp");
                books.add("hello servlet");
                books.add("hello asynServlet");
                request.setAttribute("books", books);
                actx.dispatch("/async.jsp");
            } catch (Exception e) {
                e.printStackTrace();
            }
            
            
        }
        
    }

}
