<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage=""%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>第二个jsp</title>

  </head>
  <%--jsp注释--%>
  <%--下面是jsp的声明--%>
  <%!
  //声明一个变量:
  //由于jsp声明语法定义的变量和方法对应于servlet类的成员变量和方法，所以jsp声明部分定义的变量和方法可以使用private,public等访问修饰符，也可以使用static修饰，将其变成类属性和方法。但不能使用abstruct修饰声明部分的方法，因为抽象方法将导致jsp对应servlet变成抽象类，从而无法初始化
  public int count;
  //声明一个方法
  public String info(){
	  return "hello jsp";
  }
  %>
  <body>
    <%
	out.println("count:"+(count++));
	%>
	<br>
	<%
	out.println(info());
	%>
	<p>jsp的表达式输出：</p>
	<%--jsp 的表达式--%>
	<br>
	<%=count++%>
	<br>
	<%=info()%>
	<p>jsp的脚本表达式输出：</p>
	<table bgcolor="#9990dd" border="1" width="300px">
	<% 
	  for(int i=0;i<10;i++)
	  {
		  %>
		  <tr>
		   <td>循环值</td>
		   <td><%=i%></td>
		  </tr>
	  <%}%>
	
	</table>

  </body>
</html>
