package board.dto;

import lombok.Data;

@Data
public class BoardDto { 
	private int boardIdx;
	private String title;
	private String contents;
	private String creatorId;
	
/*	@Override
	public String toString() {
		return this.title + this.contents;
	}*/
	
}
