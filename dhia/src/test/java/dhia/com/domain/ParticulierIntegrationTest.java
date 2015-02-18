package dhia.com.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Particulier.class, transactional = false)
public class ParticulierIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
}
