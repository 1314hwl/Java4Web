<%@ tag language="java" pageEncoding="UTF-8" import="java.util.List"%>
<%@  attribute name="bgColor"%>
<%@  attribute name="cellColor"%>
<%@  attribute name="title"%>
<%@  attribute name="bean"%>
<table border="1" bgColor="${bgColor} }">
	<tr>
		<td><b>${title}</b></td>
	</tr>
	<%
	    List<String> list = (List<String>) request.getAttribute("a");
	    for (String s : list) {
	%>
	<tr>
		<td bgcolor="${ cellColor}"><%=s%></td>
	</tr>

	<%
	    }
	%>
</table>
