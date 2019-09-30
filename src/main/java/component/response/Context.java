package component.response;

import java.io.Serializable;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context implements Serializable{
    
    private String name;
    private Integer lifespan;
    private Integer ttl;
    private Map<String, Map<String, String>> params;
    
}
