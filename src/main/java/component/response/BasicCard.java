package component.response;

import java.io.Serializable;

public class BasicCard implements Component, Carouselable{

	private String title;
	private String descrition;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
}
