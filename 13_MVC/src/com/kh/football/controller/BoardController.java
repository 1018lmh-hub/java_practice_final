package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.BoardDto;
import com.kh.football.model.service.BoardService;
import com.kh.football.model.vo.Board;

public class BoardController {
	private BoardService bs = new BoardService();
	
	public List<Board> findAll() {
		return bs.findAll();
	}
	
	// 컨트롤러에서 숫자 이거 1보다 큰거야? 이 정도는 함
	public Board findById(int boardNo) {
		return bs.findById(boardNo);
	}
	
	public void saveBoard(BoardDto board) {
		bs.saveBoard(board);
}
// 1번 나는 성골실패여부ㅡ를 View에 출력해줄 것이다.
	// 1 나는 오로지 성 공 실 패 여부만 출력해 줄 것이다. -> 자료형도 고민쓰 boolean
	// 2 나는 업데이트에 성공한 Board 필드값을 출력해줄 것이다.
	
	public Board updateBoard(int boardNo, BoardDto board) {
		return bs.updateBoard(boardNo, board);
	}
	
	public int deleteBoard(int boardNo) {
		return bs.deleteBoard(boardNo);
	}
}
