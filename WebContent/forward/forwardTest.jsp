<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>forward 原始页面展示</title>
  </head>
  <body>
   <h2>forward 原始页面</h2>
   <jsp:forward page="forwardResult.jsp">
    <jsp:param name="age" value="29"/>
	<jsp:param name="name" value="zhangsan"/>
   </jsp:forward>
  </body>
</html>
