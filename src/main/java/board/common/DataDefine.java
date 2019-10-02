package board.common;

import java.util.HashMap;
import java.util.Map;

public class DataDefine {

	private static DataDefine instance;
    
	//USER STATE 
	public static String USER_LOGIN_STATE_NONE_EMAIL = "USER_LOGIN_STATE_NONE_EMAIL"; //이메일주소없음
	
	public static String USER_LOGIN_STATE_WRONG_PWD = "USER_LOGIN_STATE_WRONG_PWD"; //패스워드 틀림
	
	public static String USER_LOGIN_STATE_SUCCESS = "USER_LOGIN_STATE_SUCCESS"; //로그인 성공
	 
	public static String USER_LOGIN_STATE_EXIST_EMAIL = "USER_LOGIN_STATE_EXIST_EMAIL"; //존재하는 이메일
	
	private Map<String, String> messageMap = new HashMap<String, String>();
 
    //GROUP GRADE 
	public static String GROUP_MASTER = "master"; //그룹내 유져 등급: 그룹장
	
    public static String GROUP_MANAGER = "manager"; //그룹내 유져 등급: 운영진
    
	public static String GROUP_MEMBER= "member"; //그룹내 유져 등급: 그룹내 회원
	
	public static DataDefine getInstance() {
		if( instance == null ) {
			instance = new DataDefine();
		}
		return instance;
	}
	
	private DataDefine() {
		makeMessageMapData();
	}
	
	private void makeMessageMapData() {
		messageMap.put( "USER_LOGIN_STATE_NONE_EMAIL", "없는 아이디입니다.");
		messageMap.put( "USER_LOGIN_STATE_WRONG_PWD", "틀린 패스워드입니다.");
		messageMap.put( "USER_LOGIN_STATE_SUCCESS", "로그인 되었습니다.");
		messageMap.put( "USER_LOGIN_STATE_EXIST_EMAIL",  "이미 존재하는 이메일 주소입니다.");
	}
	
	public String getMessage(String key){
		return messageMap.get(key);
	}
	
 
}
