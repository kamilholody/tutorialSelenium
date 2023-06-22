import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void beforeTest() {
        System.out.println("I am runing before test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am runing before method");
    }
}
