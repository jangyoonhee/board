package component.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable{
    
    private String id;
    private String type;
    private Properties properties;
    
}
