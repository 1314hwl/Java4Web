<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="" %>
<%@ page import="java.sql.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>out 测试</title>
  </head>
  <body>
  <%
  Class.forName("org.gjt.mm.mysql.Driver").newInstance(); 
  String url ="jdbc:mysql://localhost/springbootdb?user=root&password=654321&useUnicode=true&characterEncoding=8859_1";
  Connection conn = DriverManager.getConnection(url); 
  Statement stmt = conn.createStatement();
  ResultSet rs = stmt.executeQuery("select * from user");
  %>
  <table bgcolor="#9999dd" border="1" width="400">
  <%
    while(rs.next())
	{
		out.println("<tr>");
		out.println("<td>");
		out.println(rs.getString(1));
		out.println("<td>");
		out.println("<td>");
		out.println(rs.getString(2));
		out.println("<td>");
		out.println("<tr>");
	}
  %>
  </table>
  </body>
</html>
