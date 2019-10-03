package board.service;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.dto.UserDto;

public interface UserService {
	
	UserDto selectUser(UserDto user) throws Exception;
    
	void insertUser(UserDto user, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;
}
