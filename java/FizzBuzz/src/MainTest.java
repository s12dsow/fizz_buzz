import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    private Main main;

    @Before
    public void setUp() {
        main = new Main();
    }

    @Test
    public void testFizzBuzzWhenInputIs3() {
        String input = main.fizzBuzz(3);

        assertEquals("fizz", input);
    }

    @Test
    public void testFizzBuzzWhenInputIsMultipleOf3() {
        String input = main.fizzBuzz(9);

        assertEquals("fizz", input);
    }

    @Test
    public void testFizzBuzzWhenInputIs5() {
        String input = main.fizzBuzz(5);

        assertEquals("buzz", input);
    }

    @Test
    public void testFizzBuzzWhenInputIsMultipleOf5() {
        String input = main.fizzBuzz(10);

        assertEquals("buzz", input);
    }

    @Test
    public void testFizzBuzzWhenInputIs15() {
        String input = main.fizzBuzz(15);

        assertEquals("fizzbuzz", input);
    }

}