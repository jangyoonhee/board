package board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.dto.BoardDto;
import board.service.BoardService;


@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService; 
	
	@CrossOrigin("*")
	@RequestMapping(value="/api/board.do", method=RequestMethod.GET)
	public List<BoardDto> openBoardList() throws Exception{
        System.out.println("board.openBoardList");
		return boardService.selectBoardList();
	}
	
	
	@RequestMapping(value="/api/board/write.do" , method=RequestMethod.POST)
	public String insertBoard(BoardDto board , MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
		boardService.insertBoard(board, multipartHttpServletRequest);
		return "success";
	}

	@RequestMapping(value="/api/board/{boardIdx}.do", method=RequestMethod.GET)
	public BoardDto openBoardDetail(@PathVariable("boardIdx") int boardIdx) throws Exception{
		
		return boardService.selectBoardDetail(boardIdx);
	}
	
	@RequestMapping(value="/api/board/{boardIdx}.do", method=RequestMethod.PUT)
	public String updateBoard(@RequestBody BoardDto board) throws Exception{
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	@RequestMapping(value="/api/board/{boardIdx}.do", method=RequestMethod.DELETE)
	public String deleteBoard(@PathVariable("boardIdx") int boardIdx) throws Exception{
		boardService.deleteBoard(boardIdx);
		return "redirect:/board";
	}
    
    @RequestMapping(value="/api/meeting.do", method=RequestMethod.GET)
	public List<MeetingDto> MeetingList( int groupIdx ) throws Exception{
		return boardService.selectBoardList();
	}
	
	
	@RequestMapping(value="/api/meeting/write.do" , method=RequestMethod.POST)
	public String insertBoard(BoardDto board , MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{
		boardService.insertBoard(board, multipartHttpServletRequest);
		return "success";
	}

	@RequestMapping(value="/api/board/{boardIdx}.do", method=RequestMethod.GET)
	public BoardDto openBoardDetail(@PathVariable("boardIdx") int boardIdx) throws Exception{
		
		return boardService.selectBoardDetail(boardIdx);
	}
	
	@RequestMapping(value="/api/board/{boardIdx}.do", method=RequestMethod.PUT)
	public String updateBoard(@RequestBody BoardDto board) throws Exception{
		boardService.updateBoard(board);
		return "redirect:/board";
	}
	
	@RequestMapping(value="/api/board/{boardIdx}.do", method=RequestMethod.DELETE)
	public String deleteBoard(@PathVariable("boardIdx") int boardIdx) throws Exception{
		boardService.deleteBoard(boardIdx);
		return "redirect:/board";
	}
    
}


