package junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStringOperations {
    @Test
    public void testIsPalindrome() {
        assertTrue(StringOperations.isPalindrome("radar"));
        assertFalse(StringOperations.isPalindrome("hello"));
    }

    @Test
    public void testSimilarity() {
        assertFalse(StringOperations.similarity("abcd", "def"));
        assertTrue(StringOperations.similarity("abc", "abc"));
    }
}
