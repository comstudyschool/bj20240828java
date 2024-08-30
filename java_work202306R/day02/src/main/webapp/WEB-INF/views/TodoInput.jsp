<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>새 할일 입력</h1>
<!-- 입력 폼 들어가는 곳 -->
<form action="input" method="post">
할일: <input type="text" name="title" value="아무거나 할 일"/> <br/>
완료: <input type="text" name="done" value="false"/><br/>
<input type="submit" value="저장">
</form>
</body>
</html>