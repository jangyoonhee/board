package component.response;

import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Button  implements Serializable {
    
    private final String label;
    private final String action;
    private String webLinkUrl;
    private String blockId;
    private String messageText;
    private String osLink; 
    private Map<String, String> extra;
    
    public Button(String label, String action)
    {
        this.label = label;
        this.action = action;
    }
    
}
