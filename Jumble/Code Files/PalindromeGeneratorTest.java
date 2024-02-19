package jumble;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeGeneratorTest {

    @Test
    public void testGeneratePalindrome() {
        PalindromeGenerator palindromeGenerator = new PalindromeGenerator();
        assertEquals(321, palindromeGenerator.generatePalindrome(123));
    }

    @Test
    public void testGeneratePalindromeWithSingleDigitNumber() {
        PalindromeGenerator palindromeGenerator = new PalindromeGenerator();
        assertEquals(1, palindromeGenerator.generatePalindrome(1));
    }

    @Test
    public void testGeneratePalindromeWithNegativeNumber() {
        PalindromeGenerator palindromeGenerator = new PalindromeGenerator();
        assertEquals(54, palindromeGenerator.generatePalindrome(45));
    }

    @Test
    public void testGeneratePalindromeWithZero() {
        PalindromeGenerator palindromeGenerator = new PalindromeGenerator();
        assertEquals(0, palindromeGenerator.generatePalindrome(0));
    }

    @Test
    public void testGeneratePalindromeWithLargeNumber() {
        PalindromeGenerator palindromeGenerator = new PalindromeGenerator();
        assertEquals(987654321, palindromeGenerator.generatePalindrome(123456789));
    }
}
