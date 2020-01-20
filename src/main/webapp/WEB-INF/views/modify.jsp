<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="modify" method="post">


		<p>
			<label>글번호</label> <input type="text" name="bno"
				value="${board.bno}" readonly="readonly">
		</p>

		<p>
			<label>제목</label><input type="text" name="title"
				value="${board.title}">
		</p>

		<p>
			<label>작성자</label> <input type="text" name="writer" size="15"
				value="${board.writer}">
		</p>

		<label>내용</label>

		<textarea name=content rows="10" cols="70">${board.content}</textarea>
		<br>



		<button type="submit">완료</button>

	</form>

</body>
</html>