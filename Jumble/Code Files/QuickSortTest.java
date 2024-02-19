package jumble;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] expectedSortedArr = {11, 12, 22, 25, 34, 64, 90};
        
        quickSort.quickSort(arr, 0, arr.length - 1);
        
        assertArrayEquals(expectedSortedArr, arr);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {};
        int[] expectedSortedArr = {};
        
        quickSort.quickSort(arr, 0, arr.length - 1);
        
        assertArrayEquals(expectedSortedArr, arr);
    }

    @Test
    public void testQuickSortWithSingleElementArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {5};
        int[] expectedSortedArr = {5};
        
        quickSort.quickSort(arr, 0, arr.length - 1);
        
        assertArrayEquals(expectedSortedArr, arr);
    }

    @Test
    public void testQuickSortWithDuplicateValues() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {5, 2, 7, 2, 1};
        int[] expectedSortedArr = {1, 2, 2, 5, 7};
        
        quickSort.quickSort(arr, 0, arr.length - 1);
        
        assertArrayEquals(expectedSortedArr, arr);
    }

    @Test
    public void testQuickSortWithAlreadySortedArray() {
        QuickSort quickSort = new QuickSort();
        int[] arr = {11, 12, 22, 25, 34, 64, 90};
        int[] expectedSortedArr = {11, 12, 22, 25, 34, 64, 90};
        
        quickSort.quickSort(arr, 0, arr.length - 1);
        
        assertArrayEquals(expectedSortedArr, arr);
    }
}
