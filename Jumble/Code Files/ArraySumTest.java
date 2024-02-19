package jumble;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArraySumTest {

    @Test
    public void testSumArrays() {
        ArraySum arraySum = new ArraySum();
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] expectedSum = {5, 7, 9};
        
        int[] sumArray = arraySum.sumArrays(array1, array2);
        
        assertArrayEquals(expectedSum, sumArray);
    }

    @Test
    public void testSumArraysWithDifferentLengths() {
        ArraySum arraySum = new ArraySum();
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5};
        int[] expectedSum = {5, 7, 3};
        
        int[] sumArray = arraySum.sumArrays(array1, array2);
        
        assertArrayEquals(expectedSum, sumArray);
    }

    @Test
    public void testSumArraysWithEmptyArray() {
        ArraySum arraySum = new ArraySum();
        int[] array1 = {};
        int[] array2 = {4, 5};
        int[] expectedSum = {4, 5};
        
        int[] sumArray = arraySum.sumArrays(array1, array2);
        
        assertArrayEquals(expectedSum, sumArray);
    }

    @Test
    public void testSumArraysWithNegativeValues() {
        ArraySum arraySum = new ArraySum();
        int[] array1 = {-1, -2, -3};
        int[] array2 = {4, -5, 6};
        int[] expectedSum = {3, -7, 3};
        
        int[] sumArray = arraySum.sumArrays(array1, array2);
        
        assertArrayEquals(expectedSum, sumArray);
    }

    @Test
    public void testSumArraysWithZeroValues() {
        ArraySum arraySum = new ArraySum();
        int[] array1 = {0, 0, 0};
        int[] array2 = {0, 0, 0};
        int[] expectedSum = {0, 0, 0};
        
        int[] sumArray = arraySum.sumArrays(array1, array2);
        
        assertArrayEquals(expectedSum, sumArray);
    }
}
