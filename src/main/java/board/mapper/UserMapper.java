package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import board.dto.BoardDto;
import board.dto.UserDto;

@Mapper
public interface UserMapper {
	UserDto selectUser(String id, String pwd) throws Exception;
}
