<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>async study</title>
</head>
<body>
 <ul>
 <c:forEach items="${books}" var="book">
    <li>${book }</li>
 </c:forEach>
 </ul>
 <%out.print("业务调用结束的时间："+new java.util.Date()); 
 
 if(request.isAsyncStarted()){
     request.getAsyncContext().complete();
 }
 %> 
</body>
</html>