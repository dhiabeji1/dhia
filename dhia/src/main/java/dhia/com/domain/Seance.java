package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Seance {

    /**
     */
    private int hour_deb;

    /**
     */
    private int hour_fin;

    /**
     */
    private int si;
}
