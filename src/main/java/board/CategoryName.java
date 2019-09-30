package board;

public enum CategoryName {
    
    TRAVAL( "01", "taval"),
    LOVE( "02", "love"),
    FUN( "03", "fun"),
    STUDY( "04", "study");
    
    private String id;
    private String value;
    
    private Categoryname( String id, String value ) {
        this.id = id;
        this.value = value;
    }
    
    public String getId(){
        return id;
    }
    
    public String getValue(){
        return value;
    }
}
