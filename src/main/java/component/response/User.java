package component.response;

import java.io.Serializable;

import lombok.Data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User implements Serializable{
    
    private String id;
    private String type;
    private Properties properties;
    
}
