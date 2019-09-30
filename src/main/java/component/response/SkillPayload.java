package component.response;

import java.util.List;

public class SkillPayload implements Serializeble{
    
    private UserRequest userRequest;
    private List<Context> contexts;
    private Bot bot;
    private Action action;
    
    public void setUserRequest( UserRequest userRequest ){
        this.userRequest = userRequest;
    }
    
    public void getUserRequest( ){
       return userRequest;
    }
    
    public void setContexts( List<Context> contexts ){
        this.contexts = contexts;
    }
    
    public void getContexts( ){
       return contexts;
    }
    
    public void setBot(  Bot bot ){
        this.bot = bot;
    }
    
    public void getBot( ){
       return bot;
    }
    
     public void setAction(  Bot bot ){
        this.action = action;
    }
    
    public void getAction( ){
       return action;
    }
    
    
    public Map<String, String> getSimpleParam(String key){
        return ObjectMapperUtil.toMap( getSimpleParamValue(key));
    }
    
    public String getSimpleParamValue( String key){
        if( action != null && action.getParams() !+null ){
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
        if( userRequest != null && userRequest.getUser() !+null ){
            return userRequest.getUser().getId();
        }else{
            return "";
        }
    }
    
    public String getSimpleBlockId( ){
        if( userRequest != null && userRequest.getBlock() !+null ){
            return userRequest.getUser().getBlock().getId();
        }else{
            return "";
        }
    }
    
    public Map<String, String> getContextMap(){
        Map<String,String> contextMap = new HashMap<String, String>();
         if( contexts == null || contexts.isEmpty()) return contextMap;
        Map<String, Map<String,String>> params = contexts.get(0).getParams();
        for( Entry<STring, Map<String,String>> entry: params.entrySet()) {
            contextMap.put(entry.getKey(), entry.getValue().get("value"));
        }
        
        return contextMap;
    }
    
    
    public void setContextParam( String name, String key, String value ){
        if( contexts == null || contexts.isEmpty()){
            Context contenxt = new Context();
            context.setName( name );
            context.setLifespan(0);
            context.setTtl(600);
            Map<String, Map<String,String>> params = new HashMap<String, Map<String,String>();
            params.put( key, new HashMap<String, String>());
            context.setParams(params);
            contexts.add(context);
        }
    }
    
    public void addParamValue( String key, Map<String, Object> valueMap){
        if( action.getParams() == null){
            action.setParams( new HashMap<String,String>());
        }
        
        action.getParam().put( key, ObjectMapperUtil.toJson(valueMap));
        
        if( action.getDetailParams() == null) {
            action.setPDetailParams( new HashMap<String,DetailParam>());
        }
        
        DetailParam detailParm = new DetailParam();
        DetailParam.setOrigin("1");
        DetailParam.setGroupName("");
        DetailParam.setValue(objectMapperUtil.toJson(valueMap));
        action.getDetailParams().put(key, detailParam);
    }
}
