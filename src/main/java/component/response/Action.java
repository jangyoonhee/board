package component.response;

public class Action implements Serializable{
    
    private String id;
    private String name;
    private Map<String, String>params;
    private Map<String, String> clientExtra;
    private Map<String, DetailParam> detailParam;
}
