package jumble;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeNumbersTest {

    @Test
    public void testGeneratePrimeNumbers() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        
        List<Integer> primes = primeNumbers.generatePrimeNumbers(100);
        
        assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testGeneratePrimeNumbersWithSmallRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7);
        
        List<Integer> primes = primeNumbers.generatePrimeNumbers(10);
        
        assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testGeneratePrimeNumbersWithNegativeRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        List<Integer> expectedPrimes = Arrays.asList();
        
        List<Integer> primes = primeNumbers.generatePrimeNumbers(-10);
        
        assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testGeneratePrimeNumbersWithZeroRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        List<Integer> expectedPrimes = Arrays.asList();
        
        List<Integer> primes = primeNumbers.generatePrimeNumbers(0);
        
        assertEquals(expectedPrimes, primes);
    }

    @Test
    public void testGeneratePrimeNumbersWithLargeRange() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        List<Integer> expectedPrimes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113);
        
        List<Integer> primes = primeNumbers.generatePrimeNumbers(120);
        
        assertEquals(expectedPrimes, primes);
    }
}
