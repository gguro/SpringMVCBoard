package com.book.board.old;

import java.util.HashMap;
import java.util.Map;

import com.book.board.service.DeleteBoardController;
import com.book.board.service.GetBoardController;
import com.book.board.service.GetBoardListController;
import com.book.board.service.InsertBoardController;
import com.book.board.service.LoginController;
import com.book.board.service.LogoutController;
import com.book.board.service.UpdateBoardController;

public class HandlerMapping {
	private Map<String, IController> mappings;
	
	public HandlerMapping() {
//		mappings = new HashMap<String, IController>();
//		mappings.put("/login.do/", new LoginController());
//		mappings.put("/logout.do", new LogoutController());
//		mappings.put("/getBoardList.do", new GetBoardListController());
//		mappings.put("/getBoard.do", new GetBoardController());
//		mappings.put("/insertBoard.do", new InsertBoardController());
//		mappings.put("/updateBoard.do", new UpdateBoardController());
//		mappings.put("/deleteBoard.do", new DeleteBoardController());
	}
	
	public IController getController(String path) {
		return mappings.get(path);
	}
}
