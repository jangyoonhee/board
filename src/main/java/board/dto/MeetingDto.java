package board.dto;

import java.util.List;

import lombok.Data;

@Data
public class MeetingDto { 
 
	private int meetingIdx; 
    
	private int groupIdx;
	
	private int userIdx; //모임만든이
	
	private String title; //모임이름
	
	private String location;//모임장소
	
	private String visitUserIdStrList; //참여id ,로 나눔
	
	private String joinDateTime;//모임일시
    
    private int maxCount;//모임 인원
	
}
