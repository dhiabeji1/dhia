package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Metier {

    /**
     */
    @NotNull
    @Size(min = 5, max = 20)
    private String m_name;

    /**
     */
    @NotNull
    @Size(min = 0, max = 40)
    private String m_shortDesc;

    /**
     */
    @NotNull
    @Size(min = 0, max = 100)
    private String m_longDesc;
}
