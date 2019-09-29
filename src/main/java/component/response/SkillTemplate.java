package component.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkillTemplate implements Serializable {
	
	private List<Map<String, Component>> outputs;
    private List<QuickReply> quickReplies;
    
	public void add( String name , Component component ) {
		if(outputs == null) outputs = new ArrayList<Map<String,Component>>();
		Map<String,Component> output = new HashMap<String, Component>();
		output.put( name, component);
		outputs.add( output );
	}
    
	public List<Map<String, Component>> getOutputs() {
		return outputs;
	}
	
	public void setOutputs(List<Map<String, Component>> outputs) {
		this.outputs = outputs;
	}
    
    public List<QuickReply> getQuickReplies() {
		return quickReplies;
	}
	
	public void add(QuickReply quickReply ){
        if(quickReplies == null ) quickReplies = new ArrayList<QuickReply>();
        quickReplies.add(quickReply);
	}
    
    public void adds(QuickReply quickReplies ){
       /* for( QuickReply quickReply : quickReplies ){
            add(quickReply);
        }*/
	}
    
    @Override
    public String toString() {
        return "SkillTemplate [outputs= " + outputs + "]";
    }
}
