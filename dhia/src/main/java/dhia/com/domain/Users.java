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
import dhia.com.domain.users.Nationality;
import java.util.*;
@RooJavaBean
@RooToString
@RooMongoEntity
public class Users {

    /**
     */
    @NotNull
    @Size(min = 4, max = 12)
    private String userName;

    /**
     */
    @NotNull
    @Size(min = 6, max = 20)
    private String password;

    /**
     */
    @NotNull
    private String firstName;

    /**
     */
    @NotNull
    private String lastName;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(style = "M-")
    private Calendar birthDate;

    /**
     */
    @Enumerated
    private Gender gender;

    /**
     */
    @NotNull
    @Size(min = 2, max = 10)
    private String u_job;

    /**
     */
    @Enumerated
    private Nationality nationality;

    /**
     */
    @NotNull
    @Size(min = 8, max = 20)
    private String u_personal_phone;

    /**
     */
    @NotNull
    @Size(min = 8, max = 20)
    private String u_phone;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar created_at;
    
}
