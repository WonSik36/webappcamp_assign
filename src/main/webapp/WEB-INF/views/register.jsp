<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
	<form method="post">
		<p>
			<label>제목</label><input type="text" name="title" required>
		</p>

		<p>
			<label>작성자</label><input type="text" name="writer" size="15" required>

		</p>

		<label>내용</label>
		<p>

			<textarea rows="15" cols="65" name="content" required></textarea>
		<p>

			<button type="submit">등록</button>
	</form>
</body>
</html>