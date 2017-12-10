<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>pageContext 测试</title>
  </head>
  <body>
  <%
       pageContext.setAttribute("page","hello page");
	   pageContext.setAttribute("page1","hello page",pageContext.PAGE_SCOPE);
	   out.println("page变量所在的范围："+pageContext.getAttributesScope("page")+"<br/>");
	   out.println("page变量所在的范围："+pageContext.getAttributesScope("page1")+"<br/>"); 
	  
	   request.setAttribute("request","hello request");
	   pageContext.setAttribute("request1","hello request",pageContext.REQUEST_SCOPE);
	   out.println("request变量所在的范围："+pageContext.getAttributesScope("request")+"<br/>");
	   out.println("request变量所在的范围："+pageContext.getAttributesScope("request1")+"<br/>"); 

	   session.setAttribute("session","hello session");
	   pageContext.setAttribute("session1","hello session",pageContext.SESSION_SCOPE);
	   out.println("session变量所在的范围："+pageContext.getAttributesScope("session")+"<br/>");
	   out.println("session变量所在的范围："+pageContext.getAttributesScope("session1")+"<br/>"); 

	   application.setAttribute("application","hello application");
	   pageContext.setAttribute("application1","hello application",pageContext.APPLICATION_SCOPE);
	   out.println("application变量所在的范围："+pageContext.getAttributesScope("application")+"<br/>");
	   out.println("application变量所在的范围："+pageContext.getAttributesScope("application1")+"<br/>"); 
	   
  %>
  </body>
</html>
