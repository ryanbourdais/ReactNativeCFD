import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5ExampleAddTest {
public void testAdd() {
    assertEquals(42, Integer.sum(19, 23));
    System.out.println("This test method should be run as well");
}
}