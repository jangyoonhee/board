package component.response;

import java.io.Serializable;

import lombok.Data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetailParam implements Serializable{
    
    private String origin;
    private String value;
    private String groupName;
}
