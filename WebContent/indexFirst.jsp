<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage=""%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第二个jsp</title>
  </head>
  <body>
    <% for(int i=0;i<7;i++)
	{
	  out.println("<font size='"+i+"'>");	 
	%>
	疯狂java训练营（Hello World）</font>
	<br/>
	<%}%>
  </body>
</html>
