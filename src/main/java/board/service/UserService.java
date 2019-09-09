package board.service;

import java.util.List;

import board.dto.BoardDto;
import board.dto.UserDto;

public interface UserService {
	
	UserDto selectUser(String email, String pwd) throws Exception;
}
