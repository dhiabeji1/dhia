package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Office {

    /**
     */
    @NotNull
    @Size(min = 5, max = 20)
    private String o_name;

    /**
     */
    private Number o_number;

    /**
     */
    @NotNull
    @Size(min = 5, max = 20)
    private String o_loc;


}
