package component.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicCard implements Component, Carouselable{

	private String title;
	private String descrition;
    private List<Button> buttons;

}