package board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.common.DataDefine;
import board.dto.GroupDto;
import board.dto.UserDto;
import board.dto.UserRelationGroupDto;
import board.service.GroupService;

@RestController
public class GroupController {
    
    @Autowired
    private GroupService groupService;  
    
    //전체그룹정보
    @GetMapping("/api/v1/group/list")
	public  List<GroupDto> selectlistGroup( GroupDto groupDto ) throws Exception{
    	List<GroupDto> list = groupService.selectAllListGroupByCategory(groupDto);
        System.out.println("group.selectlistGroup");
		return list;
	}
    
    //내 그룹리스트
    @GetMapping("/api/v1/group/my")
	public List<GroupDto> selectlistMyGroup(HttpServletRequest request) throws Exception{
        HttpSession httpSession = request.getSession();
        UserDto user = (UserDto) httpSession.getAttribute("user");
        
        UserRelationGroupDto userRelationGroupDto = new UserRelationGroupDto();
        userRelationGroupDto.setUserId( user.getUserId() );
        List<GroupDto> myList= groupService.selectMyListGroup( userRelationGroupDto );
        System.out.println("group.selectlistMyGroup");
    	return myList;
	}
    
    //그룹개설
    @PostMapping("/api/v1/group/crateGroup.do")
	public Map<String,String> createGroup(HttpServletRequest request, MultipartHttpServletRequest multipartHttpServletRequest, GroupDto groupDto ) throws Exception{
        
        System.out.println("group.createGroup");
        
        HttpSession httpSession = request.getSession();
        UserDto user = (UserDto) httpSession.getAttribute("user");
        groupDto.setCreateId( user.getUserId() );
		  
    	Map<String,String> rtnMap = new HashMap<String,String>();
    	
    	groupService.createGroup(groupDto);
        
        UserRelationGroupDto userRelationGroupDto = new UserRelationGroupDto();
        userRelationGroupDto.setGroupIdx( groupDto.getGroupIdx() );
        userRelationGroupDto.setUserId( groupDto.getCreateId() );
        userRelationGroupDto.setGrade( DataDefine.GROUP_MASTER );
        groupService.enterGroup( userRelationGroupDto );
        rtnMap.put("result","success");
        return rtnMap;
	}
    
    //그룹정보
    @GetMapping("/api/v1/group/{gropuIdx}")
	public Map<String,String> selectGroup( GroupDto groupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
        System.out.println("group.selectGroup");
        return rtnMap;
		
	}
    
    //그룹 수정
    @PutMapping("/api/v1/group/{gropuIdx}")
	public Map<String,String> updateGroup( GroupDto groupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
        System.out.println("group.updateGroup");
        return rtnMap;
	}
    
    //그룹 삭제
    @DeleteMapping("/api/v1/group/{gropuIdx}")
	public Map<String,String> deleteGroup( GroupDto groupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
        System.out.println("group.deleteGroup");
        return rtnMap;
	}
    
    //그룹 가입
    @PostMapping("/api/v1/group/{gropuIdx}/user/{userIdx}")
	public Map<String,String> enterGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
    	groupService.enterGroup(userRelationGroupDto);
        System.out.println("group.enterGroup");
    	return rtnMap;
	}
    
    //그룹 탈퇴
	@DeleteMapping("/api/v1/group/{gropuIdx}/user/{userIdx}")
	public Map<String,String> secedeGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
		Map<String,String> rtnMap = new HashMap<String,String>();
		groupService.secedeGroup(userRelationGroupDto);
        System.out.println("group.secedeGroup");
		return rtnMap;
	}
    
}
