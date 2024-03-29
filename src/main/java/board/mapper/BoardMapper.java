package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import board.dto.BoardDto;
import board.dto.BoardFileDto;
import board.dto.MeetingDto;

@Mapper
public interface BoardMapper {
	List<BoardDto> selectBoardList() throws Exception;
	
	void insertBoard(BoardDto board) throws Exception;

	BoardDto selectBoardDetail(int boardIdx) throws Exception;

	void updateHitCount(int boardIdx) throws Exception;
	
	void updateBoard(BoardDto board) throws Exception;
	
	void deleteBoard(int boardIdx) throws Exception;

	void insertBoardFileList(List<BoardFileDto> list) throws Exception;

	List<BoardFileDto> selectBoardFileList(int boardIdx) throws Exception;

	BoardFileDto selectBoardFileInformation(@Param("idx") int idx, @Param("boardIdx" )int boardIdx);
    
    //meeting
    List<MeetingDto> selectMeetingBoardList( int groupIdx ) throws Exception;
	
	void insertMeetingBoard(MeetingDto board) throws Exception;
    
    void updateMeetingBoard(MeetingDto board) throws Exception;
	
	void deleteMeetingBoard(int meetingBoardIdx) throws Exception;

}
