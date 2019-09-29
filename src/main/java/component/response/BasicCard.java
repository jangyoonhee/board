package component.response;

import java.util.List;

import lombok.Data;

@Data
public class BasicCard implements Component, Carouselable{

	private String title;
	private String descrition;
    private List<Button> buttons;
	
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
    
    public void setButtons( List<Button> buttons ){
        this.buttons = buttons;
    }
    
    public List<Button> getButtons() {
		return buttons;
	}
}
