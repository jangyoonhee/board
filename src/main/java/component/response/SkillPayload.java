package component.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import board.common.ObjectMapperUtil;

public class SkillPayload implements Serializable{
    
    private UserRequest userRequest;
    private List<Context> contexts;
    private Bot bot;
    private Action action;
    
    public void setUserRequest( UserRequest userRequest ){
        this.userRequest = userRequest;
    }
    
    public UserRequest getUserRequest( ){
       return userRequest;
    }
    
    public void setContexts( List<Context> contexts ){
        this.contexts = contexts;
    }
    
    public List<Context> getContexts( ){
       return contexts;
    }
    
    public void setBot(  Bot bot ){
        this.bot = bot;
    }
    
    public Bot getBot( ){
       return bot;
    }
    
     public void setAction( Action action){
        this.action = action;
    }
    
    public Action getAction( ){
       return action;
    }
    
    
    public Map<String, String> getSimpleParam(String key){
        return ObjectMapperUtil.toMap( getSimpleParamValue(key));
    }
    
    public String getSimpleParamValue( String key){
        if( action != null && action.getParams() != null ){
            return action.getParams().get(key);
        }else{
            return "";
        }
    }
    
     public String getSimpleExtraValue( String key){
        if( action != null && action.getClientExtra() != null ){
            return action.getClientExtra().get(key);
        }else{
            return "";
        }
    }
    
    public String getSimpleUserId( ){
        if( userRequest != null && userRequest.getUser() != null ){
            return userRequest.getUser().getId();
        }else{
            return "";
        }
    }
    
    public String getSimpleBlockId( ){
        if( userRequest != null && userRequest.getBlock() != null ){
            return userRequest.getBlock().getId();
        }else{
            return "";
        }
    }
    
    public Map<String, String> getContextMap(){
        Map<String,String> contextMap = new HashMap<String, String>();
         if( contexts == null || contexts.isEmpty()) return contextMap;
        Map<String, Map<String,String>> params = contexts.get(0).getParams();
        for( java.util.Map.Entry<String, Map<String,String>> entry: params.entrySet()) {
            contextMap.put(entry.getKey(), entry.getValue().get("value"));
        }
        
        return contextMap;
    }
    
    
    public void setContextParam( String name, String key, String value ){
        if( contexts == null || contexts.isEmpty()){
            Context context = new Context();
            context.setName( name );
            context.setLifespan(0);
            context.setTtl(600);
            Map<String, Map<String,String>> params = new HashMap<String, Map<String,String>>();
            params.put( key, new HashMap<String, String>());
            context.setParams(params);
            contexts.add(context);
        }
    }
    
    public void addParamValue( String key, Map<String, Object> valueMap){
        if( action.getParams() == null){
            action.setParams( new HashMap<String,String>());
        }
        
        action.getParams().put( key, ObjectMapperUtil.toJson(valueMap) );
        
        if( action.getDetailParam() == null) {
            action.setDetailParam( new HashMap<String,DetailParam>());
        }
        
        DetailParam detailParam = new DetailParam();
        detailParam.setOrigin("1");
        detailParam.setGroupName("");
        detailParam.setValue( ObjectMapperUtil.toJson(valueMap));
        action.getDetailParam().put(key, detailParam);
    }
}
