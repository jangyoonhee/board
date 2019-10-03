package board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import board.dto.GroupDto;
import board.dto.UserRelationGroupDto;

@Mapper
public interface GroupMapper {
    

	//그룹  리스트 카테고리별
    public List<GroupDto> selectListGroup( GroupDto groupDto ) throws Exception;
    
    //가입한 그룹 인덱스 리스트
    public List<GroupDto> selectMyListGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception;
    
    //가입한 그룹 정보 리스트
    public List<GroupDto> selectMyListGroupInfo( Map<String, Object> map ) throws Exception;
    
    //그룹개설
	public int createGroup( GroupDto groupDto ) throws Exception;
    
    //그룹정보
	public GroupDto selectGroup( GroupDto groupDto ) throws Exception;
    
	
    //그룹 수정
	public void updateGroup( GroupDto groupDto ) throws Exception;
    
    //그룹 삭제
	public void deleteGroup( int groupIdx ) throws Exception;
    
    //그룹 가입
	public void enterGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception;
    
    //그룹 탈퇴
	public void secedeGroup( UserRelationGroupDto userRelationGroupDto  ) throws Exception;
    
}
