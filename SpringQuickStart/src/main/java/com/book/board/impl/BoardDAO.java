package com.book.board.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.book.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO {
	
	// JDBC 관련 변수
	
	public void insertBoard(BoardVO vo) {
		System.out.println(">> insertBoard : " + vo);
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println(">> updateBoard : " + vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println(">> deleteBoard : " + vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println(">> getBoard : " + vo);
		return null;
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println(">> getBoardList : " + vo);
		return null;
	}
}
