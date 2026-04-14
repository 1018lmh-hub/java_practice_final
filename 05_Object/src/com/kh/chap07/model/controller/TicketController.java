package com.kh.chap07.model.controller;

import com.kh.chap07.model.service.TicketService;
import com.kh.chap07.model.vo.Ticket;

public class TicketController {

	private TicketService ts = new TicketService();

//	public TicketController(Ticket ticket) {
//		System.out.println(ticket);
//	}

	public int saveTicket(Ticket ticket) {
		System.out.println("Controller : " + ticket);
		return ts.saveTicket(ticket);
		
		//10:20
		
	
	}
	 
	public Ticket printTicket() {
		//서비스야 티켓 남는 거 있으면 하나만
		return ts.printTicket();	


		
		
	}
	
	
	public Ticket[] findAll() {
		Ticket[] tickets = ts.findAll();
		return tickets;
	}
	

}
