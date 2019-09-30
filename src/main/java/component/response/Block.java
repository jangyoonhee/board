package component.response;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Block  implements Serializable {
    private String id;
    private String name;
}
