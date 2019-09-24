package component.response;

public class ContextControl implements Serializable{
    
    private List<ContextValue> values;
    
    public List<ContextValue> getValues() {
        return values;
    }
    
    public void setValues(List<ContextValue> values ){
        this.values = values;
    }
    
    public void add( ContextValue value ){
        if( values == null )values = new ArrayList<ContextValues>();
        values.add(value);
    }
    
    public ContextControl initContext(SkillPayload payload){
        ContextValue context = new ContextValue("info", 10, 600);
        context.setParams( new HaspMap<String, String>());
        context.getParams().put("custNo", "");
        context.getParams().put("reNewYn", "");
        add(context);
        return this;
    }
    
    public ContextConrol updateContext( SkillPayload payload ){
        return updateContext( payload, 10, 600 );
    }
    
    public ContextConrol updateContext( SkillPayload payload, Integer lifeSpan, Integer ttl ){
        ContextValue context = new ContextValue("info", lifeSpan, ttl);
        context.setParams( payload.getContextMap() );
        add(context);
        return this;
    }
    
    public void addContext( String key, String value ){
        ContextValue context = values.get(0);
        context.put(key, value);
    }
    
    @Override
    public String toString() {
        return "ContextControl [values= " + values + "]";
    }
    
}
