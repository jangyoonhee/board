package board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.dto.BoardDto;
import board.dto.BoardFileDto;
import board.dto.GroupDto;
import board.dto.UserRelationGroupDto;
import board.mapper.BoardMapper;
import board.mapper.GroupMapper;
import board.common.FileUtils;

@Service
public class GroupServiceImpl implements GroupService{
	
	@Autowired
	private FileUtils fileUtils;
    
    @Autowired
	private GroupMapper groupMapper;
    
    //그룹개설
	public void createGroup( GroupDto groupDto ) throws Exception{
		groupMapper.createGroup(groupDto);
	}
    
    //그룹 전체 리스트
	public List<GroupDto> selectAllListGroup(  GroupDto groupDto  ) throws Exception{
      groupDto.setCategory("");
	  List<GroupDto> list= groupMapper.selectGroup(groupDto);
      return list;
	}
    
    //그룹 my리스트
	public List<GroupDto> selectMyListGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
	  List<GroupDto> idxList =  groupMapper.selectMyListGroup(userRelationGroupDto)
      List<GroupDto> myGrouplist = groupMapper.selectMyListGroupByIdx(idxList);
      return myGrouplist;
	}
    
    //그룹 정보
	public GroupDto selectGroup( GroupDto groupDto ) throws Exception{
	  List<GroupDto> list= groupMapper.selectGroup(groupDto.getGroupIdx());
      return list;
	}
    
    //그룹 수정
	public void updateGroup( GroupDto groupDto ) throws Exception{
        groupMapper.updateGroup(groupDto);
	}
    
    //그룹 삭제
	public void deleteGroup( GroupDto groupDto ) throws Exception{
        groupMapper.deleteGroup(groupDto.getGroupIdx());
	}
    
    //그룹 가입
	public void enterGroup( UserRelationGroupDto userRelationGroupDto  ) throws Exception{
        groupMapper.enterGroup(userRelationGroupDto);
	}
    
    //그룹 탈퇴
	public void secedeGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
         groupMapper.secedeGroup(userRelationGroupDto);
		
	}

}	

