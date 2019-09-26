package board.dto;

import java.util.List;

import lombok.Data;

@Data
public class UserRelationGroupDto { 
    
    private int groupIdx;
	
	private int userIdx;
	
    private String grade;
    
    private String enterDateTime;
	
}
