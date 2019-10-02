package board.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
	private int userIdx;
	private String userId;
	private String pwd;
	private String userName;
    private String email;

}
