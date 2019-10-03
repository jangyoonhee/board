package board.service;

import java.util.List;
import java.util.Map;

import board.dto.GroupDto;
import board.dto.UserRelationGroupDto;

public interface GroupService {
	//그룹개설
	public int createGroup( GroupDto groupDto ) throws Exception;;
    
    //그룹정보
	public GroupDto selectGroup( GroupDto groupDto ) throws Exception;
    
    //모든 그룹리스트
    public List<GroupDto> selectAllListGroupByCategory( GroupDto groupDto ) throws Exception;
        
    //내그룹정보
    public List<GroupDto> selectMyListGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception;
    
    //그룹 수정
	public void updateGroup( GroupDto groupDto ) throws Exception;;
    
    //그룹 삭제
	public void deleteGroup( GroupDto groupDto ) throws Exception;;
    
    //그룹 가입
	public void enterGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception;;
    
    //그룹 탈퇴
	public void secedeGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception;
}
