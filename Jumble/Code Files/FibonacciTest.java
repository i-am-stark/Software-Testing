package jumble;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void testFibonacciWithSmallNumber() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(2, fibonacci.calculateFibonacci(3));
    }

    @Test
    public void testFibonacciWithZero() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(0, fibonacci.calculateFibonacci(0));
    }

    @Test
    public void testFibonacciWithNegativeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(-1, fibonacci.calculateFibonacci(-1));
    }

    @Test
    public void testFibonacciWithLargeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(55, fibonacci.calculateFibonacci(10));
    }

    @Test
    public void testFibonacciWithMaximumStackLength() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(89, fibonacci.calculateFibonacci(11));
    }
}
