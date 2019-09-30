package board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRelationGroupDto { 
    
    private int groupIdx;
	
	private String userId;
	
    private String grade;
    
    private String enterDateTime;
	
}
