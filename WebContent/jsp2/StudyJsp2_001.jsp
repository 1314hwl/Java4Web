<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp2.0学习</title>
</head>
<style>
table, table tr th, table tr td {
	border: 2px solid #0094ff;
}

table {
	background-color: #aaaadd;
	width: 1200px;
	min-height: 55px;
	line-height: 55px;
	text-align: center;
	border-collapse: collapse;
	width: 1200px;
}
</style>
<body>

	<form action="StudyJsp2_001.jsp" method="post">
		<br>你的名字:<input type="text" name="name" value=""></input> <input
			type="submit" value="提交">
	</form>
	<br>

	<%
	    session.setAttribute("user", "zhangSan");
	    Cookie c = new Cookie("name", "lisi");
	    c.setMaxAge(24 * 36);
	    response.addCookie(c);
	%>

	<h2>表达式语言学习</h2>
	<table>
		<tr>
			<td><b>功能</b></td>
			<td><b>表达式语言</b></td>
			<td><b>计算结果</b></td>
		</tr>
		<!-- 两种方式获取请求参数 -->
		<tr>
			<td>取得请求参数值1</td>
			<td>\${param.name}</td>
			<td>${param.name}&nbsp</td>
		</tr>
		<tr>
			<td>取得请求参数值2</td>
			<td>\${param["name"]}</td>
			<td>${param["name"]}</td>
		</tr>
		<!-- 两种方式获取请求头 -->
		<tr>
			<td>取得请求头的值1</td>
			<td>\${header.host }</td>
			<td>${header.host}</td>
		</tr>
		<tr>
			<td>取得请求头的值2</td>
			<td>\${header["accept"]}</td>
			<td>${header["accept"]}</td>
		</tr>
		<!-- 获取web应用初始化参数值 -->
		<tr>
			<td>初始化参数值</td>
			<td>\${initParam["author"]}</td>
			<td>${initParam["author"]}</td>
		</tr>

		<!-- 获取Session -->
		<tr>
			<td>获取Session</td>
			<td>\${sessionScope["user"]}</td>
			<td>${sessionScope["user"]}</td>
		</tr>

		<!-- 获取Cookie -->
		<tr>
			<td>获取Cookie</td>
			<td>\${cookie["name"]}</td>
			<td>${cookie["name"].value}</td>
		</tr>
	</table>
	<br>
</body>
</html>