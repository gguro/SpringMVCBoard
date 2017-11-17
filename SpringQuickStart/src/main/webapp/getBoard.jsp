<%@page import="com.book.board.impl.BoardDAO"%>
<%@page import="com.book.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	BoardVO board = (BoardVO) session.getAttribute("board");
%>
    
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>글 상세</title>
</head>
<body>
<center>
<h1>글 상세</h1>
<a href = "logout_proc.jsp">로그 아웃</a>
<hr>
<form action="updateBoard_proc.jsp" method="post">
<input type="hidden" name="seq" value="<%= board.getSeq() %>" />
<table border="1" cellpadding="0" cellspacing="0">
<tr>
	<td bgcolor="orange" width="70">제목</td>
	<td align="left"><input name="title" type="text" value="<%= board.getTitle() %>" /></td>
</tr>
<tr>
	<td bgcolor="orange">작성자</td>
	<td align="left"><%= board.getWriter() %></td>
	
</tr>
<tr>
	<td bgcolor="orange">내용</td>
	<td align="left"><textarea name="content" cols="40 rows="10">
		<%= board.getContent() %>
	</textarea></td>
</tr>
<tr>
	<td bgcolor="orange">등록일</td>
	<td align="left"><%= board.getRegDate() %></td>
</tr>	
<tr>
	<td bgcolor="orange">조회수</td>
	<td align="left"><%= board.getCnt() %></td>
</tr>
<tr>
	<td colspan="2" align="center">
		<input type="submit" value="글 수정" />
	</td>
</tr>


</table>
</form>

<hr>

<a href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp;
<a href="deleteBoard.jsp">글삭제</a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.jsp">글 목록</a>

</center>













</body>
</html>