<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>application测试</title>
  </head>
  <body>
      <%!
	   int i;
	%>
    <%
	application.setAttribute("counter",String.valueOf(++i));
	%>
	<br>
    <%=i%>
  </body>
</html>
