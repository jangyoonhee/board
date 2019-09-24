package component.response;

import java.io.Serializable;

public class SkillResponse implements Serializable {
    private final String version;
	private SkillTemplate template;
    private ContextControl context;
    private Map<String, String> data;
        
    public SkillResponse(String version){
        this.version = version;
    }
    
	public SkillTemplate getTemplate() {
		return template;
	}

	public void setTemplate(SkillTemplate template) {
		this.template = template;
	}
	
    public ContextControl getContext(){
        return context;
    }
   
    public void setContext( ContextControl context ){
        this.context = context;
    }
    
    public Map<String, String> getContext(){
        return data;
    }
   
    public void setData(Map<String, String> data ){
        this.data = data;
    }
    
    public String getVersion() {
        return version;
    }
    
    @Override
    public String toString() {
        return "SkillResponse [version= " + version + ", template=" + template + ", context=" + context + ", data=" + data + "]";
    }
}
