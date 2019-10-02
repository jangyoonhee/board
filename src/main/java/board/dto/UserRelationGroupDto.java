package board.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRelationGroupDto { 
    
    private int groupIdx;
	
	private String userId;
	
    private String grade;
    
    private String enterDateTime;
	
}
