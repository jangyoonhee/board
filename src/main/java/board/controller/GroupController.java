package board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import board.dto.BoardDto;
import board.dto.GroupDto;
import board.dto.UserRelationGroupDto;
import board.service.GroupService;

@RestController
public class GroupController {
    
    @Autowired
    private GroupService groupService;  
    
    //전체그룹정보
    @GetMapping(value="/api/v1/group/list")
	public  List<GroupDto> selectlistGroup( GroupDto groupDto ) throws Exception{
    	List<GroupDto> list = groupService.selectGroup(groupDto);
        System.out.println("group.selectlistGroup");
		return list;
	}
    
    //내 그룹리스트
    @GetMapping(value="/api/v1/group/my")
	public Map<String,String> selectlistMyGroup( GroupDto groupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
    	System.out.println("group.selectlistMyGroup");
    	return rtnMap;
	}
    
    //그룹개설
    @PostMapping(value="/api/v1/group/regist")
	public Map<String,String> createGroup( GroupDto groupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
        System.out.println("group.regist");
        return rtnMap;
	}
    
    //그룹정보
    @GetMapping(value="/api/v1/group/{gropuIdx}")
	public Map<String,String> selectGroup( GroupDto groupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
        System.out.println("group.selectGroup");
        return rtnMap;
		
	}
    
    //그룹 수정
    @PutMapping(value="/api/v1/group/{gropuIdx}")
	public Map<String,String> updateGroup( GroupDto groupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
        System.out.println("group.updateGroup");
        return rtnMap;
	}
    
    //그룹 삭제
    @DeleteMapping(value="/api/v1/group/{gropuIdx}")
	public Map<String,String> deleteGroup( GroupDto groupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
        System.out.println("group.deleteGroup");
        return rtnMap;
	}
    
    //그룹 가입
    @PostMapping(value="/api/v1/group/{gropuIdx}/user/{userIdx}")
	public Map<String,String> enterGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
    	Map<String,String> rtnMap = new HashMap<String,String>();
    	groupService.enterGroup(userRelationGroupDto);
        System.out.println("group.enterGroup");
    	return rtnMap;
	}
    
    //그룹 탈퇴
	@DeleteMapping(value="/api/v1/group/{gropuIdx}/user/{userIdx}")
	public Map<String,String> secedeGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
		Map<String,String> rtnMap = new HashMap<String,String>();
		groupService.secedeGroup(userRelationGroupDto);
        System.out.println("group.secedeGroup");
		return rtnMap;
	}
    
}
