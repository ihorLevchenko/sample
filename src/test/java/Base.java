import org.junit.BeforeClass;

public class Base {

    static PeopleTest logic;

    @BeforeClass
    public static void setup() {
        logic = new PeopleTest();
    }
}
