package board.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import board.dto.UserDto;
import board.service.BoardService;

@Controller
@RequestMapping("/v1/user/")
public class UserController {
	
	@Autowired
	private BoardService boardService; 
	
    
    //회원 로그인      
	@ResponseBody
	@RequestMapping(value="login.do",  method=RequestMethod.POST)
	public Map<String,String> login( HttpServletRequest req, @RequestParam(value="email")String email ,@RequestParam(value="pwd") String pwd){
		System.out.println( "email"+email + " , "+ "pwd" + pwd );
        Map<String,String> rtnMap = new HashMap<String,String>();
        //아이디 비번 유져테이블에 있는지 확인
        rtnMap.put( "result" , "success" );
		return rtnMap;
	}


    //회원가입
	@ResponseBody
	@RequestMapping(value="regist.do", method=RequestMethod.POST)
	public Map<String,String> regist( HttpServletRequest req , ModelMap model ) throws Exception{
        Map<String,String> rtnMap = new HashMap<String,String>();
        //아이비가 유져테이블에 있는지 확인
        //없을 경우 insert 
        rtnMap.put( "result" , "success" );
		return rtnMap;
	}
	
    //회원 정보 조회
	@RequestMapping(value="{userid}",method=RequestMethod.GET)
	public Map<String,String> getUserID( HttpServletRequest req) throws Exception{
        Map<String,String> rtnMap = new HashMap<String,String>();
        //아이디 비번 유져테이블에 있는지 확인
        rtnMap.put( "result" , "success" );
		return rtnMap;
	}
	
}
