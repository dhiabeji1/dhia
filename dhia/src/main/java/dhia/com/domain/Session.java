package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Session {

    /**
     */
    private Number session_key;

    /**
     */
    @NotNull
    @Size(min = 0, max = 20)
    private String secret;

    /**
     */
    @NotNull
    @Size(min = 0, max = 20)
    private String expiry;

    /**
     */
    @NotNull
    @Size(min = 0, max = 20)
    private String s_data;

    /**
     */
    @NotNull
    @Size(min = 0, max = 20)
    private String inactive_expiry;
}
