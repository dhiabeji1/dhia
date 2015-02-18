package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import dhia.com.domain.users.Nationality;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Adress_user {

    /**
     */
    @NotNull
    private String u_adress;

    /**
     */
    private String u_adress2;

    /**
     */
    @Enumerated
    private Nationality nationality;

    /**
     */
    private Long p_zipcode;
}
