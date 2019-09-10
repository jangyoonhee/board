package board.service;

import board.dto.UserDto;

public interface UserService {
	
	UserDto selectUser(String email, String pwd) throws Exception;
    
	Integer insertUser(UserDto user) throws Exception;
}
