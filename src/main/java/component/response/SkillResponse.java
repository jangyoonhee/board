package component.response;

import java.io.Serializable;

public class SkillResponse implements Serializable {
	private SkillTemplate template;

	public SkillTemplate getTemplate() {
		return template;
	}

	public void setTemplate(SkillTemplate template) {
		this.template = template;
	}
	
	@Override
	public String toString() {
		return this.template.toString();
	}
	
}
