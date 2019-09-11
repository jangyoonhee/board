package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import board.dto.BoardDto;
import board.dto.UserDto;
import board.mapper.BoardMapper;
import board.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
    @Autowired
	private FileUtils fileUtils;
    
	@Override
	public UserDto selectUser(String email, String pwd) throws Exception {
		return userMapper.selectUser( email, pwd );
	}
    
    @Override
    public Integer insertUser(UserDto user, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
        userMapper.insertBoard(user);
		List<BoardFileDto> list = fileUtils.parseFileInfo(user.getUserIdx(), multipartHttpServletRequest);
		if(CollectionUtils.isEmpty(list) == false){
			userMapper.insertFileList(list);
		}

        return userMapper.insertUser( user );
	}
	
}	

