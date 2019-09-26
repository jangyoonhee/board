package board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import board.dto.BoardDto;
import board.dto.BoardFileDto;

@Mapper
public interface GroupMapper {
    
    //그룹개설
	public GroupDto createGroup( GroupDto groupDto ) throws Exception;
    
    //그룹정보
	public GroupDto selectGroup( int groupIdx ) throws Exception;
    
    //그룹 수정
	public Map<String,String> updateGroup( GroupDto groupDto ) throws Exception;
    
    //그룹 삭제
	public Map<String,String> deleteGroup( int groupIdx ) throws Exception;
    
    //그룹 가입
	public Map<String,String> enterGroup( int groupIdx , int uesrIdx ) throws Exception;
    
    //그룹 탈퇴
	public Map<String,String> secedeGroup( int groupIdx , int uesrIdx ) throws Exception;
    
}
