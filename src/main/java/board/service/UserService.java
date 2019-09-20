package board.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.dto.UserDto;

public interface UserService {
	
	Map<String,String> selectUser(UserDto user) throws Exception;
    
	void insertUser(UserDto user, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;
}
