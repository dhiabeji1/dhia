package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Metier_detail {

    /**
     */
    @NotNull
    @Size(min = 5, max = 20)
    private String m_description;

    /**
     */
    @NotNull
    private String m_fulldesc;

    /**
     */
    @NotNull
    private String m_service;
}
