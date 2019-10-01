package component.response;

import java.io.Serializable;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Properties implements Serializable{
    
    private String plusfriendUserKey;
    private String appUserId;
}
