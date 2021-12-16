<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.List" %> 
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "java.util.HashMap" %>
    <%@ page import = "java.util.Map" %>
    <%@ page import = "java.util.Set" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료구조 활용</title>
</head>
<body>

<%--리스트,맵 --%>

<%

	//과일 이름 리스트
	List<String> fruits = new ArrayList<>();
	fruits.add("사과");
	fruits.add("비나나");
	fruits.add("딸기");
	fruits.add("쌰인머스캣");
	fruits.add("귤");
%>

<table border = 1>
<%
	for(String fruit:fruits){%>
	<tr>
		<td><%=fruit %></td>
	</tr>
<%}%>

</table>




<% 
//과목과 성적 맵 
Map<String, Integer> scores = new HashMap<>();

scores.put("국어",85);
scores.put("수학",90);
scores.put("영어",100);
%>
 
<table border = 1>
	<thead>
		<tr>
			<th>과목</th>
			<th>성적</th>
		</tr>
	</thead>
	<tbody>
	
	<%
		Set<String>keys = scores.keySet();
		for(String name: keys){
			
		}
	%>
	<tr>
		<td><%= name %></td>
		<td><%=scores.get(name) %></td>
	</tr>
	
		<tr>
			<td>국어</td>
			<td>85</td>
		
		</tr>
	</tbody>


</table>






%>
	<tr>
		<td>사과</td>
	</tr>
	
	<tr>
		<td>바나나</td>
	</tr>
	
	<tr>
		<td>딸기</td>
	</tr>
	
	<tr>
		<td>샤인머스캣</td>
	</tr>
	
	<tr>
		<td>귤</td>
	</tr>



</table>

</body>
</html>