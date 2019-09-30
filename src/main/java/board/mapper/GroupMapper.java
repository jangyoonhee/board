package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import board.dto.BoardDto;
import board.dto.BoardFileDto;
import board.dto.GroupDto;
import board.dto.UserRelationGroupDto;

@Mapper
public interface GroupMapper {
    
    //그룹개설
	public void createGroup( GroupDto groupDto ) throws Exception;
    
    //그룹정보
	public List<GroupDto> selectGroup( int groupIdx ) throws Exception;
    
    //내그룹정보
    public List<GroupDto> selectMyListGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception;
    
    //그룹 수정
	public void updateGroup( GroupDto groupDto ) throws Exception;
    
    //그룹 삭제
	public void deleteGroup( int groupIdx ) throws Exception;
    
    //그룹 가입
	public void enterGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception;
    
    //그룹 탈퇴
	public void secedeGroup( UserRelationGroupDto userRelationGroupDto  ) throws Exception;
    
}
