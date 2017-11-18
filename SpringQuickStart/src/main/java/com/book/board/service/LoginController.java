package com.book.board.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.book.board.user.UserVO;
import com.book.board.user.impl.UserDAO;

@Controller
public class LoginController {

	@RequestMapping(value="/login.do", method=RequestMethod.GET) 
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println("로그인 화면으로 이동 ");
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}
	
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(@ModelAttribute("user") UserVO vo, UserDAO userDAO, HttpSession session) {
		
		System.out.println("로그인 인증 처리 ");
		UserVO user = userDAO.getUser(vo);
		
		if(user != null) {
			session.setAttribute("userName", user.getName());
			return "redirect:getBoardList.do";
		} else {
			return "redirect:login.jsp";
		}
	}
	
	

}
