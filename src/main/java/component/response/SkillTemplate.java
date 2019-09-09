package component.response;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkillTemplate implements Serializable {
	
	private List<Map<String, Component>> outputs;
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
}
