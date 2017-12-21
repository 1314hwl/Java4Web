<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 注意下面的这行代码是：表达式语言的自定义标签的使用 -->
<%@ taglib prefix="servlet2tag" uri="http://com.cn.wh/servlet2/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlet2 Tld</title>
</head>
<style>
table {
	margin-top: 10px;
}
</style>
<body>
	<h2>表达式语言-servlet2自定义函数</h2>
	请输入一个字符串:
	<form action="UseFunctions.jsp" method="post">
		<input type="text" name="name"> <input type="submit"
			value="提交">
	</form>
	<table border="1" bgcolor="#aaaadd">
		<tr>
			<td><b>表达式语言</b></td>
			<td><b>计算结果</b></td>
		</tr>
		<tr>
			<td>\${param["name"] }</td>
			<td>${param["name"] }&nbsp</td>
		</tr>
		<tr>
			<td>\${servlet2tag:reverse(param["name"])}</td>
			<td>${servlet2tag:reverse(param["name"])}</td>
		</tr>
		<tr>
			<td>\${servlet2tag:reverse(servlet2tag:reverse(param["name"])) }</td>
			<td>${servlet2tag:reverse(servlet2tag:reverse(param["name"])) }&nbsp</td>
		</tr>
		<tr>
			<td>\${servlet2tag:countChar(param["name"])}</td>
			<td>${servlet2tag:countChar(param["name"])}&nbsp</td>
		</tr>
	</table>
</body>
</html>