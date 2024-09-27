<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰 목록</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>리뷰</th>
			<th>글쓴이</th>
			<th>등록일</th>
		</tr>
		<c:forEach items="${list}" var="review">
			<tr>
				<td>${review.reviewId}</td>
				<td><a href="review?action=detail&id=${review.reviewId}">${review.content}</a></td>
				<td>${review.userName}</td>
				<td>${review.regDate}</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>