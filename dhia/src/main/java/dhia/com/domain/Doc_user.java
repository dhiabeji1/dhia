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

@RooJavaBean
@RooToString
@RooMongoEntity
public class Doc_user {

    /**
     */
    @NotNull
    @Size(min = 0, max = 20)
    private String docname;

    /**
     */
    @NotNull
    @Size(min = 0, max = 20)
    private String doc_description;

    /**
     */
    @NotNull
    @Size(min = 0, max = 20)
    private String doc_full_description;

    /**
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar doc_createdDate;
}
