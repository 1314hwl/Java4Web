package com.cn.hwl.servlet2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet(name = "upload", urlPatterns = { "/upload" })
@MultipartConfig
public class UploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
          res.setContentType("text/html;charset=utf-8");
          PrintWriter out =res.getWriter();
          req.setCharacterEncoding("utf-8");
          String name=(String)req.getAttribute("name");
          Part part=req.getPart("file");
          out.println("file 类型:"+part.getContentType()+"<br>");
          out.println("file 大小:"+part.getSize()+"<br>");
          Collection<String>headers=part.getHeaderNames();
          for(String header:headers) {
              out.println("header name:"+part.getHeader(header)+"<br>");
          }
          String fileNameInfo=part.getHeader("content-disposition");
          out.println("file 名称:"+fileNameInfo+"<br>");
//          String fileName=fileNameInfo.substring(0, fileNameInfo.length());
    }

}
