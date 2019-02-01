import org.junit.BeforeClass;

public class Base {

    static Logic logic;

    @BeforeClass
    public static void setup() {
        logic = new Logic();
    }
}
