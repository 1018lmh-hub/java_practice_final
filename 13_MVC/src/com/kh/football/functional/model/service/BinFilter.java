package com.kh.football.functional.model.service;

import com.kh.football.functional.model.dto.Material;

@FunctionalInterface // 이 인터페이스는 함수형이야 람다 쓸거야
public interface BinFilter {
	boolean test(Material m);
	// void aaa(); // 추상 메소드가 2개? -> 람다 불가 메서드 명을 안쓰니까
	
}
