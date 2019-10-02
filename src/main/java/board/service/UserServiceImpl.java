package board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.common.DataDefine;
import board.common.FileUtils;
import board.dto.BoardFileDto;
import board.dto.UserDto;
import board.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
    @Autowired
	private FileUtils fileUtils;
    
	@Override
	public UserDto selectUser(UserDto user) throws Exception {
		Map<String,String> rtnMap = new HashMap<String,String>();
		UserDto resultUser = userMapper.selectUser( user );
	
		return resultUser;
	}
    
    @Override
    public void insertUser(UserDto user, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
    	userMapper.insertUser(user);
		List<BoardFileDto> list = fileUtils.parseFileInfo(user.getUserIdx(), multipartHttpServletRequest);
		if(CollectionUtils.isEmpty(list) == false){
			userMapper.insertFileList(list);
		}
	}
	
}	

