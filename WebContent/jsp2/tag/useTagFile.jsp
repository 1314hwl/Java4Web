<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage=""%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>迭代器 tag file</title>
</head>
<body>
	<h2>迭代器tag file</h2>
	<%
	    List<String> data = new ArrayList<String>();
	    data.add("学习迭代器");
	    data.add("hello 迭代器");
	    data.add("有意思");
	    request.setAttribute("a", data);
	%>
	<h3>使用自定义标签</h3>
	<tags:iterator bgColor="#99dd99" cellColor="#9999cc" title="迭代器标签"
		bean="a" />
</body>
</html>