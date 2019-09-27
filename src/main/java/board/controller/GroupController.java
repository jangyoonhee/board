package board.controller;

@RestController
public class GroupController {
    
    @Autowired
    private GroupService groupService;  
    
    //전체그룹정보
    @GetMapping(value="/api/v1/group/list")
	public Map<String,String> selectlistGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.selectlistGroup");
		
	}
    
    //전체그룹내 카테고리별 정보
    @GetMapping(value="/api/v1/group/list/{category}")
	public Map<String,String> selectlistGroupByCategory( GroupDto groupDto ) throws Exception{
        System.out.println("group.selectlistGroupByCategory");
	}
    
    //내 그룹리스트
    @GetMapping(value="/api/v1/group/my")
	public Map<String,String> selectlistMyGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.selectlistMyGroup");
		
	}
    
    //그룹개설
    @PostMapping(value="/api/v1/group/regist")
	public Map<String,String> createGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.regist");
	}
    
    //그룹정보
    @GetMapping(value="/api/v1/group/{gropuIdx}")
	public Map<String,String> selectGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.selectGroup");
		
	}
    

    
    
    //그룹 수정
    @PutMapping(value="/api/v1/group/{gropuIdx}")
	public Map<String,String> updateGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.updateGroup");
		
	}
    
    //그룹 삭제
    @DeleteMapping(value="/api/v1/group/{gropuIdx}")
	public Map<String,String> deleteGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.deleteGroup");
		
	}
    
    //그룹 가입
    @PostMapping(value="/api/v1/group/{gropuIdx}/user/{userIdx}")
	public Map<String,String> enterGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
        groupService.enterGroup(userRelationGroupDto)
        System.out.println("group.enterGroup");
		
	}
    
    //그룹 탈퇴
	@DeleteMapping(value="/api/v1/group/{gropuIdx}/user/{userIdx}")
	public Map<String,String> secedeGroup( UserRelationGroupDto userRelationGroupDto ) throws Exception{
        groupService.enterGroup(secedeGroup)
        System.out.println("group.secedeGroup");
		
	}
    
}
