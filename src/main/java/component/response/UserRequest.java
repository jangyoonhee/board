package component.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserRequest implements Serializable{
    
    private String timezone;
    private Block block;
    private String utterance;
    private String land;
    private User user;
}
