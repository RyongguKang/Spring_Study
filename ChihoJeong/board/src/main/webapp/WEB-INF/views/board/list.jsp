<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성일</th>
			<th>작성자</th>
			<th>조회수</th>
		</tr>
	</thead>
	
	<tbody>
		<!-- 컨트롤러에서 받아온 데이터를 출력 jstl 반복문 사용 -->
		<c:forEach items="${list }" var="list">
			<tr>
				<td>${list.bno }</td>
				<td>${list.title }</td>
				<td>${list.regDate }</td>
				<td>${list.writer }</td>
				<td>${list.viewCnt }</td>
			</tr>
		</c:forEach>
	
	</tbody>
</table>

</body>
</html>