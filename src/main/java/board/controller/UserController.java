package board.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.common.DataDefine;
import board.dto.UserDto;
import board.service.UserService;

@RestController
@RequestMapping("api/v1/user/")
public class UserController {
	
	@Autowired
	private UserService userService; 

    //회원 로그인      
	@CrossOrigin("*")
	@RequestMapping(value="/loginEnter.do",  method=RequestMethod.POST)
	public Map<String,String> login( HttpServletRequest request, UserDto userDto) throws Exception {
		UserDto resultUser = userService.selectUser(userDto);
		Map<String,String> rtnMap = new HashMap<String,String>();
		if( resultUser == null ) {
			rtnMap.put( "code" , DataDefine.USER_LOGIN_STATE_NONE_EMAIL);
			rtnMap.put( "result" , "fail" );
		}else {

			if( userDto.getPwd().equals(resultUser.getPwd())) {
				 rtnMap.put( "result" , "success" );
				 //인증처리 기능 전까지 임시
				 HttpSession httpSession = request.getSession();
				 httpSession.setAttribute("user", resultUser);
			}else {
				rtnMap.put( "result" , "fail" );
				rtnMap.put( "code" , DataDefine.USER_LOGIN_STATE_WRONG_PWD);
			}
		}
		
		rtnMap.put( "message", DataDefine.getInstance().getMessage( rtnMap.get( "code" ) ));
		return rtnMap;
	}

    //회원가입
	@CrossOrigin("*")
	@RequestMapping(value="/registAdd.do", method=RequestMethod.POST)
	public Map<String,String> registAdd(UserDto userDto, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception{

		UserDto resultUser = userService.selectUser(userDto);
		Map<String,String> rtnMap = new HashMap<String,String>();
		if( resultUser == null ) {
			 userService.insertUser( userDto , multipartHttpServletRequest );
			 rtnMap.put( "result" , "success" );
		}else {
			 rtnMap.put( "result" , "fail" );
			 rtnMap.put( "code", DataDefine.USER_LOGIN_STATE_EXIST_EMAIL);
		}
		
		rtnMap.put( "message", DataDefine.getInstance().getMessage(rtnMap.get( "code" )));
		return rtnMap;
	}
	
    //회원 정보 조회
	@CrossOrigin("*")
	@RequestMapping(value="{userid}",method=RequestMethod.GET)
	public Map<String,String> getUserID( HttpServletRequest req) throws Exception{
        Map<String,String> rtnMap = new HashMap<String,String>();
        //아이디 비번 유져테이블에 있는지 확인
        rtnMap.put( "result" , "success" );
		return rtnMap;
	}
	
}
