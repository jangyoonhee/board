package component.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class DetailParam implements Serializable{
    
    private String origin;
    private String value;
    private String groupName;
}
