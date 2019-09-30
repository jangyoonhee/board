package component.response;

import java.io.Serializable;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Action implements Serializable{
    
    private String id;
    private String name;
    private Map<String, String>params;
    private Map<String, String> clientExtra;
    private Map<String, DetailParam> detailParam;
}
