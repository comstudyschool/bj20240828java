<%@page import="org.comstudy.myapp.phonebook.model.Phone"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
li {
	display: inline-block;
}
</style>
<body>

<h1>전화 번호 목록</h1>
<%
// request, session, application, pageContext에 공통 메소드
//.getAttribute(name);
//.setAttribute(name, o);
//.getAttributeNames();
//Enumeration enumList = request.getAttributeNames();
//while(enumList.hasMoreElements()) {
//	System.out.println(enumList.nextElement());
//}

// setAttribute로 저장된 데이터는 모두 Object타입이다.
// 다시 getAttribute 해서 사용 하려면 다운캐스팅 해야 한다.
ArrayList<Phone> list = (ArrayList<Phone>)request.getAttribute("list");
%>
<form action="list.do" method="GET">
	검색: <input type="text" name="name" />
	<input type="submit" value="검색" />
</form>
<hr />
<table width="90%" border="1">
<%
for(Phone phone : list) {
	out.println(phone.toRow());
}
%>
</table>

<ul>
	<li><a href="input.do">전화번호 등록</a> | </li>
	<li><a href="list.do">목록</a></li>
</ul>

</body>
</html>