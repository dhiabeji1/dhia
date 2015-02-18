package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import dhia.com.domain.users.Gender;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Particulier {

    /**
     */
    @NotNull
    @Size(min = 5, max = 20)
    private String name;

    /**
     */
    @Enumerated
    private Gender gender;

    /**
     */
    @Size(min = 2)
    private String p_metier;

    /**
     */
    @NotNull
    @Size(min = 3, max = 20)
    private String p_personal_phone;

    /**
     */
    @NotNull
    @Size(min = 3, max = 20)
    private String p_office_phone;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar p_birthday;
}
