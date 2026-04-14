package com.kh.chap04.model.vo;

import java.io.Serializable;

public class Message implements Serializable {
	//vo 값
	//service 나의 꿈 비즈니스 로직
	
	private String to;
	private String content;
	
	public Message(String to, String content) {
		super();
		this.to = to;
		this.content = content;
	}

	public String getTo() {
		return to;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Message [to=" + to + ", content=" + content + "]";
	}

	

	
	
	
	

}
