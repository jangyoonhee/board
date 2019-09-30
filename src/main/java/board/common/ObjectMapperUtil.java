package board.common;

public class ObjectMapperUtil {
    
    //obj >> json
    public static String toJson( Object obj ){
         return new ObjectMapper().writeValueAsSting( obj );
    }
    
    //json을 object(vo)
    public static <T> toVo( String json, Class<T> clazz ){
        return new ObjectMapper().readValue( json, clazz );
    }
    
    //json >> list
      public static <T> List<T> toList( String json, Class<T> clazz ){
        return new ObjectMapper().readValue( json, new  ObjectMapper().getTypeFactory().constructCollectionType(List.class, clazz));
    }
    
    //json>> map
          public static Map<String, String> toMap( String json ){
        return new ObjectMapper().readValue( json, new TypeReference<Map<String,String>> (){});
    }
}
