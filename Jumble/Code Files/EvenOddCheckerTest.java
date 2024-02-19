package jumble;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvenOddCheckerTest {

    @Test
    public void testCheckEvenOddWithEvenNumber() {
        EvenOddChecker checker = new EvenOddChecker();
        assertEquals("Even", checker.checkEvenOdd(4));
    }

    @Test
    public void testCheckEvenOddWithOddNumber() {
        EvenOddChecker checker = new EvenOddChecker();
        assertEquals("Odd", checker.checkEvenOdd(7));
    }

    @Test
    public void testCheckEvenOddWithZero() {
        EvenOddChecker checker = new EvenOddChecker();
        assertEquals("Even", checker.checkEvenOdd(0));
    }

    @Test
    public void testCheckEvenOddWithNegativeNumber() {
        EvenOddChecker checker = new EvenOddChecker();
        assertEquals("Odd", checker.checkEvenOdd(-5));
    }

    @Test
    public void testCheckEvenOddWithLargeNumber() {
        EvenOddChecker checker = new EvenOddChecker();
        assertEquals("Even", checker.checkEvenOdd(1000));
    }
}
