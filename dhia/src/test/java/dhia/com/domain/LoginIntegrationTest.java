package dhia.com.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Login.class, transactional = false)
public class LoginIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
}
