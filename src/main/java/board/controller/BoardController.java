package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.dto.BoardDto;
import board.dto.MeetingDto;
import board.service.BoardService;


@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService; 

	/*
	 * 자유게시판
	 */
	@CrossOrigin("*")
	@GetMapping(value="/api/board.do")
	public List<BoardDto> openBoardList() throws Exception{
        System.out.println("board.openBoardList");
		return boardService.selectBoardList();
	}
	
	@PostMapping(value="/api/board/write.do")
	public String insertBoard(BoardDto board , MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
		boardService.insertBoard(board, multipartHttpServletRequest);
		return "success";
	}

	@GetMapping(value="/api/board/{boardIdx}.do")
	public BoardDto openBoardDetail(@PathVariable("boardIdx") int boardIdx) throws Exception{
		
		return boardService.selectBoardDetail(boardIdx);
	}
	
	@PutMapping(value="/api/board/{boardIdx}.do")
	public String updateBoard(@RequestBody BoardDto board) throws Exception{
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	@DeleteMapping(value="/api/board/{boardIdx}.do")
	public String deleteBoard(@PathVariable("boardIdx") int boardIdx) throws Exception{
		boardService.deleteBoard(boardIdx);
		return "redirect:/board";
	}
    
	/*
	 * 모임게시판
	 */
    @GetMapping(value="api/v1/user/meeting.do")
	public List<MeetingDto> MeetingList( int groupIdx ) throws Exception{
		return boardService.selectMeetingBoardList( groupIdx );
	}
	
	@PostMapping(value="api/v1/user/write.do")
	public String insertMeetingBoard(MeetingDto meetingDto , MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
		boardService.insertMeetingBoard(meetingDto);
		return "success";
	}

	@PutMapping(value="api/v1/meeting/{meetingIdx}.do")
	public String updateMeetingBoard(@RequestBody MeetingDto meetingDto) throws Exception{
		boardService.updateMeetingBoard(meetingDto);
		return "success";
	}

	@DeleteMapping(value="/api/v1/meeting/{meetingIdx}.do")
	public String deleteMeetingBoard(@PathVariable("meetingIdx") int meetingIdx) throws Exception{
		boardService.deleteMeetingBoard(meetingIdx);
		return "success";
	}
    
}


