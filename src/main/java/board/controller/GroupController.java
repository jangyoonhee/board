package board.controller;

@RestController
public class GroupController {
    
    @Autowired
    private GroupService groupService;  
    
    //그룹개설
    @PostMapping(value="/api/group/regist")
	public Map<String,String> createGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.regist");
	}
    
    //그룹정보
    @GetMapping(value="/api/group/{gropuIdx}")
	public Map<String,String> selectGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.selectGroup");
		
	}
    
    //그룹 수정
    @PutMapping(value="/api/group/{gropuIdx}")
	public Map<String,String> updateGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.updateGroup");
		
	}
    
    //그룹 삭제
    @DeleteMapping(value="/api/group/{gropuIdx}")
	public Map<String,String> deleteGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.deleteGroup");
		
	}
    
    //그룹 가입
    @PostMapping(value="/api/group/{gropuIdx}/user/{userIdx}")
	public Map<String,String> enterGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.enterGroup");
		
	}
    
    //그룹 탈퇴
	@DeleteMapping(value="/api/group/{gropuIdx}/user/{userIdx}")
	public Map<String,String> secedeGroup( GroupDto groupDto ) throws Exception{
        System.out.println("group.secedeGroup");
		
	}
    
}
