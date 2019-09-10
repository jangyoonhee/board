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
    //http://www.namooz.com/2016/12/10/spring-boot-restful-web-service-example-get-post-put-delete-patch/
    //get방식은 body의 내용을 담을수없다. 그러므로 requestbody를 사욯알수없다. @requestBody는 post에만 붙는다.
	@ResponseBody
	@RequestMapping(value="regist.do", method=RequestMethod.POST)
	public Map<String,String> regist( HttpServletRequest req, @requestBody userDto){
        Map<String,String> rtnMap = new HashMap<String,String>();
        //아이디 및 이메일이 유져테이블에 있는지 확인
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
