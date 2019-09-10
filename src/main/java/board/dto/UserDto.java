package board.dto;

import lombok.Data;

@Data
public class UserDto {
	private int userIdx;
	private String id;
	private String pwd;
	private String image;
	private String name;
    private String email;

}
