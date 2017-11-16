package com.book.board.user.impl;

import org.springframework.stereotype.Repository;

import com.book.board.user.UserService;
import com.book.board.user.UserVO;

@Repository("userDAO")
public class UserDAO  {
	
	
	public UserVO getUser(UserVO vo) {
		System.out.println(">> getUser : " + vo);
		
		return null;
	}
}
