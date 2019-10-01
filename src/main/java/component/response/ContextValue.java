package component.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContextValue implements Serializable{
    
    private final String name;
    private final Integer lifeSpan;
    private final Integer ttl;
    private Map<String, String> params;
    
    public ContextValue(String name, Integer lifeSpan, Integer ttl){
        this.name= name;
        this.lifeSpan = lifeSpan;
        this.ttl = ttl;
    }
    
    public String getName() {
        return name;
    }
    
    public Integer getlifeSpan() {
        return lifeSpan;
    }
    
    public Integer getTtl() {
        return ttl;
    }
    
    public void put(String key, String value){
        if(params == null) params = new HashMap<String, String>();
        params.put( key, value );
    }
    
    public void put(String key, long value){
        if(params == null) params = new HashMap<String, String>();
        params.put( key, String.valueOf(value) );
    }
    
    @Override
    public String toString() {
        return "ContextValue [name= " + name + ", lifeSpan=" + lifeSpan + ", ttl=" + ttl + ", params=" + params + "]";
    }

}
