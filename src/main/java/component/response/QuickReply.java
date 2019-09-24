package component.response;

public class QuickReply  implements Serializable{
    private String label;
    private String action;
    private String messageText;
    private String blockId;
    private Map<String, String> extra;
    
    public void setLabel(String label){
        if( label.trim().length() <= 2 ){
            label = "  " + label.trim() + "  ";
        }
        
        this.label = label;
    }
    
    public String getLabel() {
		return label;
	}
	
    public void setAction(String action){
        this.action = action;
    }
    
        
    public String getAction() {
		return action;
	}
	
    public void setMessageText(String action){
        this.messageText =messageText;
    }
    
        
    public String getMessageText() {
		return messageText;
	}
    
    
    public void setBlockId(String blockId){
        this.blockId =blockId;
    }
    
        
    public String getBlockId() {
		return blockId;
	}
    
    public void setExtra(Map<String, String> extra){
        this.extra =extra;
    }
    
        
    public Map<String, String> getExtra() {
		return extra;
	}
    
    public void put( String key, String value ){
        if( extra == null) extra = new HashMap<String,String>();
        extra.put( key, value);
    }
    
    public void put( String key, Object value ){
        if( extra == null) extra = new HashMap<String,String>();
        extra.put( key, value.toString());
    }
    
    @Override
    public String toString() {
        return "QuickReply [label= " + label + ", action=" + action + ", messageText=" + messageText + ", blockId=" + blockId + ", extra=" + extra "]";
    }
}
