<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.*" %> 
    <%@ page import = "java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
           
 <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<title>calendar</title>
</head>
<body>

<%

 	Calendar today = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
	String formatString = formatter.format(today.getTime());

%>
	<%=today %>
	<br>
	<%=formatString %>
	
	
	<%
		Calendar calendar = Calendar.getInstance();
		
	//날짜 계산
	//calendar.add(Calendar.DATE, 20);
	//calendar.add(Calendar.MONTH, 5);
	//calendar.add(Calendar.YEAR, 10);
	
	%>
	<br>
	<h1><%=formatter.format(calendar.getTime()) %></h1>
	
	
	<%-- 날짜 비교 --%>
	
	<%
	//앞에 것이 뒤에 것 보다 크다 : 양수
	//앞에 것이 뒤에 것 보다 작다 : 음수
	//같다 : 0
	
	int result = today.compareTo(calendar);
	
	if(result >0){
		out.println("today가 더 크다.");
	}else if(result < 0 ){
		out.println("today가 더 작다");
	}else {
		out.println("같다");
	}
	
	
	%>
	
	

</body>
</html>