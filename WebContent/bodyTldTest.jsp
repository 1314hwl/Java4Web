<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://com.cn.hwl.bodytld" prefix="bodyTld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试body标签库</title>
</head>
<body>
	<bodyTld:query driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/java4web" username="root"
		password="123456" sql="select * from user"></bodyTld:query>
</body>
</html>