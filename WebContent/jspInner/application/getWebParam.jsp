<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>applicaiton 获取 web.xml 中配置參數</title>
  </head>
  <body>
    <%="获取 web.xml 中配置參數 value = "+application.getInitParameter("driver")%>
  </body>
</html>
