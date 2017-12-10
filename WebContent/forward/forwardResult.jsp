<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>forward 结束页面</title>
  </head>
  <body>
    <%="姓名："+request.getParameter("name")%>
	<br>
    <%="年龄："+request.getParameter("age")%>
  </body>
</html>
