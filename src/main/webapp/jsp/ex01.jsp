<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = java.util.List %>
    <%@ page import = java.util.ArrayList %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>


	<!-- html주석 -->
	<%--jsp주석: 페이지 소스 보기에는 안보여진다. -서버에서 처리되고 사라짐 --%>
	
	<%
	
	//1~10까지 합
	int sum=0;
	for (int i=0; i<10; i++){
		sum += i;		
	}
	
	%>
	
	<Strong>합계 : <%= sum %></Strong>
	
	<%
	List<String>animals = new ArrayList<>();
	animals.add("dog");
	animals.add("cat");
	
	%>
	
	
	<b><%animals.get(0);%></b><br>
	<b><%animals.get(1);%></b>
	
	<%--선언 (멤버 변수, 메소드 선언 --%>
	<%!
		private int number = 10;
		
	
		//Hello world 라는 문자열 리턴하는 메소드ㅡ
		public String getHelloWorld(){
			return "hello world";
		}
		
	%>
	
	<%= number +20 %>
	
	<br>
	
	<%= getHelloWorld() %>
	
</body>
</html>