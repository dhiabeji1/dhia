package dhia.com.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Users.class, transactional = false)
public class UsersIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
}
