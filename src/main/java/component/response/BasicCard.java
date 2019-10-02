package component.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BasicCard implements Component, Carouselable{

	private String title;
	private String descrition;
    private List<Button> buttons;
    
    public void add( Button button ){
        if( buttons == null )buttons = new ArrayList<Button>();
        buttons.add(button);
    }
    
    //여기
    public void adds( Button button ){
      /*  for( Button button: buttons ){
            add(button);
        }
        */
    }

    public void addDescription(String line){
        if( isEmpty(descrition)){
            descrition = line;
        }else{
            descrition += "\n" + line;
        }
    }
    
    public Boolean isEmpty(String str){
        return str == null || str.equals("");
    }

}