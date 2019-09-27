package board.service;

import java.util.List;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import board.dto.BoardFileDto;
import board.dto.BoardDto;

public interface GroupService {
	//그룹개설
	public Map<String,String> createGroup( GroupDto groupDto );
    
    //그룹정보
	public Map<String,String> selectGroup( GroupDto groupDto );
    
    //그룹 수정
	public Map<String,String> updateGroup( GroupDto groupDto );
    
    //그룹 삭제
	public Map<String,String> deleteGroup( GroupDto groupDto );
    
    //그룹 가입
	public Map<String,String> enterGroup( UserRelationGroupDto userRelationGroupDto );
    
    //그룹 탈퇴
	public Map<String,String> secedeGroup( UserRelationGroupDto userRelationGroupDto );
}
