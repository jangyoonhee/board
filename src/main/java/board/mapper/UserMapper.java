package board.mapper;

import org.apache.ibatis.annotations.Mapper;

import board.dto.UserDto;

@Mapper
public interface UserMapper {
	UserDto selectUser(String id, String pwd) throws Exception;
	Integer insertUser( UserDto userDto ) throws Exception;
}
