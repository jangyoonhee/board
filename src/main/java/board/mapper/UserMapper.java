package board.mapper;

import org.apache.ibatis.annotations.Mapper;

import board.dto.UserDto;

@Mapper
public interface UserMapper {
	UserDto selectUser(String id, String pwd) throws Exception;
	Integer insertUser(UserDto userDto) throws Exception;
    void insertFileList(List<BoardFileDto> list) throws Exception;
	List<BoardFileDto> selectFileList(int boardIdx) throws Exception;
	BoardFileDto selectFileInformation(@Param("idx") int idx, @Param("boardIdx" )int boardIdx);
}