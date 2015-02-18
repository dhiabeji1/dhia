package dhia.com.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import java.util.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@RooJavaBean
@RooToString
@RooMongoEntity
public class RDV {

    /**
     */
    private int time_unit;

    /**
     */
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date hour_deb;

    /**
     */
    private int hour_fin;
}
