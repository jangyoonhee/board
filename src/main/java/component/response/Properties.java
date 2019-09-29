package component.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class Properties implements Serializable{
    
    private String plusfriendUserKey;
    private String appUserId;
}
