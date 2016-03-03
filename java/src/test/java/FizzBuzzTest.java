import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizzBuzzWhenInputIs3() {
        String input = fizzBuzz.fizzBuzz(3);

        assertEquals("fizz", input);
    }
    @Test
    public void testFizzBuzzWhenInputIsMultipleOf3() {
        String input = fizzBuzz.fizzBuzz(9);

        assertEquals("fizz", input);
    }

    @Test
    public void testFizzBuzzWhenInputIs5() {
        String input = fizzBuzz.fizzBuzz(5);

        assertEquals("buzz", input);
    }

    @Test
    public void testFizzBuzzWhenInputIsMultipleOf5() {
        String input = fizzBuzz.fizzBuzz(10);

        assertEquals("buzz", input);
    }

    @Test
    public void testFizzBuzzWhenInputIs15() {
        String input = fizzBuzz.fizzBuzz(15);

        assertEquals("fizzbuzz", input);
    }
    @Test
    public void testFizzBuzzWhenInputIs1() {
        String input = fizzBuzz.fizzBuzz(1);

        assertEquals("1", input);
    }
}
