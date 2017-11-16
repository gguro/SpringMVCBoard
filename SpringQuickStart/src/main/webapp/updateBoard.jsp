<%@page import="com.book.board.impl.BoardDAO"%>
<%@page import="com.book.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
	// 1. 사용자 입력 정보 추출
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String seq = request.getParameter("seq");
	
	
	// 2. db 연동 처리
	BoardVO vo = new BoardVO();
	vo.setTitle(title);
	vo.setContent(content);
	vo.setSeq(Integer.parseInt(seq));
	
	BoardDAO boardDAO = new BoardDAO();
	boardDAO.updateBoard(vo);
	
	// 3. 화면 네비게이션
	response.sendRedirect("getBoardList.jsp");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>