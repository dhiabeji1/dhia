package dhia.com.repositories;
import dhia.com.domain.Users;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Users.class)
public interface UserRepository {

    List<Users> findAll();
}
