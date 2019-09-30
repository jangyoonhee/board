package component.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContextControl implements Serializable{
    
    private List<ContextValue> values;
    
    public List<ContextValue> getValues() {
        return values;
    }
    
    public void setValues(List<ContextValue> values ){
        this.values = values;
    }
    
    public void add( ContextValue value ){
        if( values == null )values = new ArrayList();
        values.add(value);
    }
    
    public ContextControl initContext(SkillPayload payload){
        ContextValue context = new ContextValue("info", 10, 600);
        //context.setParams( new HashMap<String, String>() );
       // context.getParams().put("custNo", "");
        //context.getParams().put("reNewYn", "");
        add(context);
        return this;
    }
    
    public ContextControl updateContext( SkillPayload payload ){
        return updateContext( payload, 10, 600 );
    }
    
    public ContextControl updateContext( SkillPayload payload, Integer lifeSpan, Integer ttl ){
        ContextValue context = new ContextValue("info", lifeSpan, ttl);
        //context.setParams( payload.get() );
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
