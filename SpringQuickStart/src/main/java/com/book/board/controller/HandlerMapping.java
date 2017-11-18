package com.book.board.controller;

import java.util.HashMap;
import java.util.Map;

public class HandlerMapping {
	private Map<String, IController> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, IController>();
		mappings.put("/login.do/", new LoginController());
	}
	
	public IController getController(String path) {
		return mappings.get(path);
	}
}
