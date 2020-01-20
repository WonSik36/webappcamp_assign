<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<table border="1" width="880">
		<tr>
			<td width="77">
				<p align="center">글번호</p>
			</td>
			<td width="327">
				<p align="center">제목</p>
			</td>
			<td width="197">
				<p align="center">작성자</p>
			</td>
			<td width="155">
				<p align="center">작성일</p>
			</td>
			<td width="155">
				<p align="center">수정일</p>
			</td>
			<td width="90">
				<p align="center">조회수</p>
			</td>
		</tr>
		<c:forEach items="${list}" var="board">
			<tr>
				<td>${board.bno}</td>

				<td><a href='./read?bno=${board.bno}'>${board.title}</a></td>

				<td>${board.writer}</td>

				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
						value="${board.regdate}" /></td>

				<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
						value="${board.moddate}" /></td>
						
				<td><span>${board.viewcnt}</span></td>
			</tr>
		</c:forEach>
	</table>
	<a href="register">글쓰기</a>
</body>
</html>