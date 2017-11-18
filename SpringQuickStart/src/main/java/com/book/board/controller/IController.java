package com.book.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IController {
	String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
