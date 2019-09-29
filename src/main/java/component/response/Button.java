package component.response;

import java.util.Map;
import lombok.Data;

@Data
public class Button {
    
    private final String label;
    private final String action;
    private String webLinkUrl;
    private String blockId;
    private String messageText;
    private String osLink; 
    private Map<String, String> extra;
}
