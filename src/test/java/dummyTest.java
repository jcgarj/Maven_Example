import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class dummyTest {
    @Before
    public void beforeTestDo(){
        System.out.println("Antes de las pruebas");

    }
    @Test
    public void dummyTest(){
        System.out.println("this the test");
        assertTrue(true);
    }
    @After
    public void afterTestDo(){
        System.out.println("Despues de las pruebas");
    }
}
