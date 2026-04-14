package com.kh.football.controller;

import java.util.List;

import com.kh.football.model.dto.FootballPlayerDto;
import com.kh.football.model.service.FootballService;
import com.kh.football.model.vo.FootballPlayer;

//View 와 Model 사이에서 제어
public class FootballController {
	private FootballService fs = new FootballService();

	// 뷰에서 축구선수들 값 출력하기 위해 호출하는 메소드
	public List<FootballPlayer> selectAll() {
		List<FootballPlayer> list = fs.selectAll();
		return list;
	}

//	public void addFootballPlayer(String name, String position, int backNumber) {
//		fs.addFootballPlayer(name, position, backNumber);
//	}

	// 선택지 == 2개
	// 1. Object
	// 2. FootballPlayerDto
	public FootballPlayer addFootballPlayer(FootballPlayerDto fpd) {
		return (fs.addFootballPlayer(fpd));
	}

	public boolean checkId(int id) {
		return fs.checkId(id);
	}

	public void updateFootballPlayer(int id, FootballPlayerDto player) {
		fs.updateFootballPlayer(id, player);
	}

	public String deleteFootballPlayer(int id) {
		return fs.deleteFootballPlayer(id);
	}
	
	public void outputFootballPlayer() {
		fs.outputFootballPlayer();
	}
	
	public  List<FootballPlayer> findByKeyword(String keyword) {
		return fs.findByKeyword(keyword);
	}

}
