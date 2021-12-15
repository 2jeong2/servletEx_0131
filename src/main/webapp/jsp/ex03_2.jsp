<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post method2</title>
</head>
<body>

	<%
		String nickname = request.getParameter("nickname");
		String animal = request.getParameter("animal");
		String fruit = request.getParameter("fruit");
		String[] food = request.getParameterValues("food");
		
		String foodList = "";
		for(int i =0; i< food.length; i++){
			foodList += food[i]+" ";
		}
	
	%>

<table border=1>
	<tr>
		<td>별명</td>
		<td><%= nickname %></td>
	
	</tr>
	<tr>
		<td>동물</td>
		<td><%= animal %></td>
	</tr>
	<tr>
		<td>과일</td>
		<td><%=fruit %></td>
	
	</tr>
	<tr>
		<td>음식</td>
		<td><%= foodList %></td>
	
	</tr>

</table>


</body>
</html>