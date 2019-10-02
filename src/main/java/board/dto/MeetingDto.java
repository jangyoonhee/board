package board.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MeetingDto { 
 
	private int meetingIdx; 
    
	private int groupIdx;
	
	private String userId; //모임만든이
	
	private String title; //모임이름
	
	private String location;//모임장소
	
	private String visitUserIdStr; //참여id ,로 나눔
	
	private String joinDatetime;//모임일시
    
    private int maxCount;//모임 인원
	
}
