<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>模拟登陆展示</title>
</head>
<body>
	<span style="color: red; font-weight: bold"> <%
     if (request.getAttribute("err") != null) {
         out.println(request.getAttribute("err") + "<br/>");
     }
 %>
	</span>
	<form id="login" method="post" action="login">
		用户名:&nbsp&nbsp&nbsp&nbsp<input type="text" name="userName"></input><br />
		密&nbsp&nbsp&nbsp&nbsp码:&nbsp&nbsp&nbsp<input type="password"
			name="pass"></input><br /> <br> <input type="submit" value="登陆">
		<input type="reset" value="重置">
	</form>

</body>
</html>