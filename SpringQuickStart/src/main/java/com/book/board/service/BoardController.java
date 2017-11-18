package com.book.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.book.board.BoardVO;
import com.book.board.impl.BoardDAO;

@Controller
@SessionAttributes("board")
public class BoardController {

	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
	// 글 등록 
	@RequestMapping(value="/insertBaord.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.insertBoard(vo);
		return "redirect:getBoardList.do";
	}

	// 글 수정 
	@RequestMapping(value="/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
		
		System.out.println("글 수정 처리");
		
		boardDAO.updateBoard(vo);
		
		return "redirect:getBoardList.do";
	}
	
	// 글 삭제 
	@RequestMapping(value="/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		System.out.println("글 삭제 처리 ");
		boardDAO.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	// 글 상세 조회 
	@RequestMapping(value="/getBoard.do")
	public String getBoard(@ModelAttribute("board") BoardVO vo, BoardDAO boardDAO, Model model) {
		
		BoardVO board = boardDAO.getBoard(vo);
		model.addAttribute("board", board);
		
		return "getBoard.jsp";
	}
	
	// 글 목록 검색  
	@RequestMapping(value="/getBoardList.do")
	public String getBoardList(@RequestParam(value="searchCondition", defaultValue="TITLE", required=false) String condition,
			@RequestParam(value="searchKeyword", defaultValue="", required=false) String keyword,
			BoardVO vo, BoardDAO boardDAO, Model model) {
		System.out.println("글 목록 검색 처리");
		System.out.println("검색 조건 : " + condition);
		System.out.println("검색 단어 : " + keyword);
		
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		model.addAttribute("boardList", boardList);
		return "getBoardList.jsp";		
	}
	
}
