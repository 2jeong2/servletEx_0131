<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>post method</title>
</head>
<body>

	<form method="post" action="/jsp/ex03_2.jsp">
		1.별명 : <input type="text" name="nickname"><br>
		<!-- 라디오 버튼 -->
		2.강아지 고양이 <br>
		<label>고양이<input type="radio" name="animal" value="cat"></label>
		<label>강아지<input type="radio" name="animal" value="dog"></label>
		<br>
		<!-- select box -->
		3.좋아하는 과일 선택<br>
		<select name="fruit">
			<option value="apple">사과</option>
			<option value="banana">바나나</option>
			<option value="peach">복숭아</option>
			<option value="grape">포도</option>
			<option value="strobrerry">딸기</option>
		</select>
		<br>
		4.선호하는 음식을 모두 고르세요.<br>
		<label>민트초코<input type="checkbox" name="food" value="mintchoco"></label>
		<label>하와이안피자<input type="checkbox" name="food" value="pizza"></label>
		<label>번데기<input type="checkbox" name="food" value="pupa"></label><br>
		
		<button type="submit">전송</button><br>
		
		
		
		
	</form>

</body>
</html>