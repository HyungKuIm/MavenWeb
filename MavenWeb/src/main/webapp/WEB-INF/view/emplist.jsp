<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 리스트</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<c:forEach var="emp" items="${empList}">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.name}</td>
			<td>${emp.age}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>