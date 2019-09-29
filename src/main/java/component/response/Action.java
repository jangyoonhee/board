package component.response;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

@Data
public class Action implements Serializable{
    
    private String id;
    private String name;
    private Map<String, String>params;
    private Map<String, String> clientExtra;
    private Map<String, DetailParam> detailParam;
}
