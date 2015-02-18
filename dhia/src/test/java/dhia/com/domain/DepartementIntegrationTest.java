package dhia.com.domain;
import org.junit.Test;
import org.springframework.roo.addon.test.RooIntegrationTest;

@RooIntegrationTest(entity = Departement.class, transactional = false)
public class DepartementIntegrationTest {

    @Test
    public void testMarkerMethod() {
    }
}
