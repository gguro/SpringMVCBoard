package com.book.board.old;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IController {
	String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
