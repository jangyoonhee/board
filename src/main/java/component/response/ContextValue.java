package component.response;

public class ContextValue implements Serializable{
    
    private final String name;
    private final Integer lifeSpan;
    private final Integer ttl;
    private Map<String, String> param;
    
    public ContextValue(String name, Integer lifeSpan, Integer ttl){
        this.name= name;
        this.lifeSpan = lifeSpan;
        this.ttl = ttl;
    }
    
    public String getName() {
        return name;
    }
    
    public String getlifeSpan() {
        return lifeSpan;
    }
    
    public String getTtl() {
        return ttl;
    }
    
    public void put(String key, String value){
        if(params == null) params = new HaspMap<String, String>();
        params.put( key, value );
    }
    
    public void put(String key, long value){
        if(params == null) params = new HaspMap<String, String>();
        params.put( key, value.toString() );
    }
    
    @Override
    public String toString() {
        return "ContextValue [name= " + name + ", lifeSpan=" + lifeSpan + ", ttl=" + ttl + ", params=" + params + "]";
    }

}
