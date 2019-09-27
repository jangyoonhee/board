package board.dto;

import java.util.List;

import lombok.Data;

@Data
public class GroupDto { 
    
    private int groupIdx;
	
	private String createId;
	
	private String fastJoin;// 버전 2기반 1시에는 무조건 그룹장 승인없이 가입가능
	
	private String introdution;
	
	private String createdDatetime;

    private String groupName;
    
    private int peopleMaxCount;
    
    private String category;
    
	private List<BoardFileDto> fileList;
	
}
