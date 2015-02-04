import com.ci.InitialClass;
import junit.framework.*;

public class TestInitialClass extends TestCase {
    private InitialClass a;

    public void setUp() {
        a = new InitialClass();
    }

    public void testSimple() {
        assertTrue("simple test", a.isTestPassed());
    }
}