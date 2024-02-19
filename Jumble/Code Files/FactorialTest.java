package jumble;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorialWithPositiveNumber() {
        Factorial factorial = new Factorial();
        assertEquals(120, factorial.calculateFactorial(5));
    }

    @Test
    public void testFactorialWithZero() {
        Factorial factorial = new Factorial();
        assertEquals(6, factorial.calculateFactorial(3));
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        Factorial factorial = new Factorial();
        assertEquals(40320, factorial.calculateFactorial(8));
    }

    @Test
    public void testFactorialWithLargeNumber() {
        Factorial factorial = new Factorial();
        assertEquals(1307674368000L, factorial.calculateFactorial(15));
    }

    @Test
    public void testFactorialWithMaximumStackLength() {
        Factorial factorial = new Factorial();
        assertEquals(1, factorial.calculateFactorial(0));
    }
}
