package com.kh.football.model.dto;

public class BoardDto {

	
		private int boardNo;					
		private String boardTitle;		
		private String boardContent;	 
		private String boardWriter;		 
		private String password;			 
		private String createDate;
		
		
		
		public BoardDto(String boardTitle, String boardContnet, String boardWriter, String password) {
			this.boardTitle = boardTitle;
			this.boardContent = boardContnet;
			this.boardWriter = boardWriter;
			this.password = password;
		}

		public BoardDto(int boardNo, String boardTitle, String boardContnet, String boardWriter, String password,
				String createDate) {
			this.boardNo = boardNo;
			this.boardTitle = boardTitle;
			this.boardContent = boardContnet;
			this.boardWriter = boardWriter;
			this.password = password;
			this.createDate = createDate;
		}

		public int getBoardNo() {
			return boardNo;
		}

		public void setBoardNo(int boardNo) {
			this.boardNo = boardNo;
		}

		public String getBoardTitle() {
			return boardTitle;
		}

		public void setBoardTitle(String boardTitle) {
			this.boardTitle = boardTitle;
		}

		public String getBoardContnet() {
			return boardContent;
		}

		public void setBoardContnet(String boardContnet) {
			this.boardContent = boardContnet;
		}

		public String getBoardWriter() {
			return boardWriter;
		}

		public void setBoardWriter(String boardWriter) {
			this.boardWriter = boardWriter;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCreateDate() {
			return createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		@Override
		public String toString() {
			return "BoardDto [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContnet=" + boardContent
					+ ", boardWriter=" + boardWriter + ", password=" + password + ", createDate=" + createDate + "]";
		}		 
		
		
		
}
