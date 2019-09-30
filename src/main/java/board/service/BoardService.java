package board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.dto.BoardFileDto;
import board.dto.BoardDto;

public interface BoardService {
	
    //board
    List<BoardDto> selectBoardList() throws Exception;
        
	void insertBoard(BoardDto board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;
    
	BoardDto selectBoardDetail(int boardIdx) throws Exception;

	void updateBoard(BoardDto board) throws Exception;

	void deleteBoard(int boardIdx) throws Exception;

	BoardFileDto selectBoardFileInformation(int idx, int boardIdx) throws Exception; 
    
    
    //meeting
    List<MeetingDto> selectMeetingBoardList( int groudIdx )throws Exception;
	
    void insertMeetingBoard(MeetingDto meetingDto) throws Exception;
    
    void updateMeetingBoard(MeetingDto meetingDto) throws Exception;
    
    void deleteMeetingBoard(int meetingIdx) throws Exception;
 
}
