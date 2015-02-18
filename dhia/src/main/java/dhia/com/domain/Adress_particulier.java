package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Adress_particulier {

    /**
     */
    @NotNull
    @Size(min = 3, max = 20)
    private String p_adress1;

    /**
     */
    @NotNull
    @Size(min = 3, max = 20)
    private String p_adress2;

    /**
     */
    private Long p_zipcode;

    /**
     */
    @NotNull
    @Size(min = 3, max = 20)
    private String p_city;

    /**
     */
    @NotNull
    @Size(min = 3, max = 20)
    private String p_country;
}
