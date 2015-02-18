package dhia.com.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Even.class, transactional = false)
public class EvenIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
}
