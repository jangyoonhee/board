package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.dto.BoardDto;
import board.dto.BoardFileDto;
import board.mapper.BoardMapper;
import board.common.FileUtils;

@Service
public class GroupServiceImpl implements BoardService{
	
	@Autowired
	private FileUtils fileUtils;
    
    @Autowired
	private GroupMapper groupMapper;
    
    //그룹개설
	public Map<String,String> createGroup( GroupDto groupDto ) throws Exception{
        groupMapper.insertGroup(groupDto);
	}
    
    //그룹정보
	public Map<String,String> selectGroup( GroupDto groupDto ) throws Exception{
       groupMapper.selectGroup(groupDto);
	}
    
    //그룹 수정
	public Map<String,String> updateGroup( GroupDto groupDto ) throws Exception{
        groupMapper.updateGroup(groupDto);
	}
    
    //그룹 삭제
	public Map<String,String> deleteGroup( GroupDto groupDto ) throws Exception{
        groupMapper.deleteGroup(groupDto);
	}
    
    //그룹 가입
	public Map<String,String> enterGroup( UserRelationGroupDto userRelationGroupDto  ) throws Exception{
        groupMapper.enterGroup(userRelationGroupDto);
	}
    
    //그룹 탈퇴
	public Map<String,String> secedeGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
         groupMapper.secedeGroup(userRelationGroupDto);
		
	}

}	

