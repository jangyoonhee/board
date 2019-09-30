package component.response;

import java.io.Serializable;
import java.util.Map;
import lombok.Data;

@Data
public class Context implements Serializable{
    
    private String name;
    private Integer lifespan;
    private Integer ttl;
    private Map<String, Map<String, String>> params;
    
}
