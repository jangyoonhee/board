package board.common;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperUtil {
    
    //obj >> json
    public static String toJson( Object obj ){
    	try {
            return new ObjectMapper().writeValueAsString( obj );
    	}catch( Exception e) {
    		return null;
    	}

    }
    
    //json >> list
	public static <T> List<T> toList( String json, Class<T> clazz ){
		try {
				return new ObjectMapper().readValue( json, new  ObjectMapper().getTypeFactory().constructCollectionType(List.class, clazz));
	   	}catch( Exception e) {
	   		return null;
	   	}
    }
    
    //json>> map
    public static Map<String, String> toMap( String json ){
    	try {
    		return new ObjectMapper().readValue(json, new TypeReference<Map<String, String>>(){});
    	}catch( Exception e) {
	   		return null;
	   	}
    }
}
