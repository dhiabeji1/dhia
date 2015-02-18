package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import java.math.BigDecimal;
import dhia.com.domain.users.Nationality;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooMongoEntity
public class User_detail {

    /**
     */
    private BigDecimal weight;

    /**
     */
    @Enumerated
    private Nationality nationality;

    /**
     */
    @Enumerated
    private Religion religion;

    /**
     */
    private String u_comment;

    /**
     */
    private String u_injury;

    /**
     */
    @Enumerated
    private Eyes u_eyes_color;

    /**
     */
    @NotNull
    private String blood_type;

    /**
     */
    @NotNull
    private String u_hair_color;

    /**
     */
    @NotNull
    private String u_skin_color;

    /**
     */
    @NotNull
    private String u_relation;

    /**
     */
    @NotNull
    private String u_race;

    /**
     */
    @NotNull
    private String u_status;
}
