package com.kh.chap05.view;

import com.kh.chap05.model.vo.Member;

public class MemberView {
	
	public void memberMenu() {
		
		Member member = new Member();
//		Member member = new Member("user01", "1234", "홍길동");
		System.out.println(member.info());
//		new Math();
		Member member1 = new Member("uesr01");
		System.out.println(member1.info());
		
		Member member2 = new Member("user02", "pass02");
		
		Member member3 = new Member("user03", "pass03", "홍길동");
		
	}

}
