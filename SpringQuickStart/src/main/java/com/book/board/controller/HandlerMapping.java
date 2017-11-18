package com.book.board.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
	private Map<String, IController> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, IController>();
		mappings.put("/login.do/", new LoginController());
		mappings.put("/logout.do", new LogoutController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
	}
	
	public IController getController(String path) {
		return mappings.get(path);
	}
}
