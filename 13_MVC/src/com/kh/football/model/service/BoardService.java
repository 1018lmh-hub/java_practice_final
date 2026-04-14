package com.kh.football.model.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kh.football.model.dto.BoardDto;
import com.kh.football.model.vo.Board;

public class BoardService {
	
	
	
	private List<Board> boards = new ArrayList();
	private int id;
	{
		boards.add(new Board(++id, "첫 글입니다~", "재밌당", "관리자", "1234", new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		boards.add(new Board(++id, "또 글입니다~", "하하호호", "관리자", "1234", new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
	}
	
	public List<Board> findAll(){
		return boards;
	}
	
	public Board findById(int boardNo) {
//		if(boards.get(0).getBoardNo() == boardNo) {
//			return  boards.get(0);
//		}
//		for(Board board : boards) {
//			if(board.getBoardNo() == boardNo) {
//				return board;
//			}
//		}
//		return null;
		
		return boards.stream()
								.filter(b -> b.getBoardNo() == boardNo)
								.findFirst()
								.orElse(null);
	}
	
	public void saveBoard(BoardDto board) {
		// 유효성 검증
		// 4개나 검증. . . ->
		
		boards.add(new Board(++id ,board.getBoardTitle(), board.getBoardContnet(), 
														  board.getBoardWriter(), board.getPassword(), 
														  new SimpleDateFormat("yyyy-MM-dd").format(new Date())));
		
	}
	
	public Board updateBoard(int boardNo, BoardDto board) {
		//boardNo 를 이용해서 Boards 에서 boardNo 와 일치하는 Board객체의 인덱스를 찾는다.
		// 찾아온 Board 객체의 write필드, password 필드와 
		// 사용자가 입력한 write필드, password 필드를 각각 동등비교한다.
		// 두개의 필드가 모두 동일할 시 새로운 BoardVO 객체를 생성한 뒤 list의 set 메소드로 갱신한다.
		int index = 0;
		for(int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				index = i;
			}
		}
		Board b = boards.get(index);
		if(b.getBoardWriter().equals(board.getBoardWriter()) 
			&& b.getPassword().equals(board.getPassword())) {
			new Board(boardNo, board.getBoardTitle(), board.getBoardContnet(), b.getBoardWriter(), b.getPassword(), b.getCreateDate());
			return boards.get(index);
			
		} else return null;
		
	}
	public int deleteBoard(int boardNo) {
		// 삭제 성공 시 1을 반환
		// 삭제 실패 시 0을 반환
		if(boardNo < 0) {
			return 0;
		}
		int index = -1;
		for(int i = 0; i < boards.size(); i++) {
			if(boards.get(i).getBoardNo() == boardNo) {
				index = i;
				break;
			}
		}
		if(index > -1) {
			boards.remove(index);
			return 1;
		}
		return 0;
	}
	
	
	
}
