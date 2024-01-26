package arrays;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    @Test
    public void testQuickSort() {
        int[] inputArray = {5, 2, 9, 1, 5, 6};
        int[] expectedArray = {1, 2, 5, 5, 6, 9};
        QuickSort.quickSort(inputArray, 0, inputArray.length - 1);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testQuickSortWithSortedArray() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        QuickSort.quickSort(inputArray, 0, inputArray.length - 1);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testQuickSortWithReverseSortedArray() {
        int[] inputArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        QuickSort.quickSort(inputArray, 0, inputArray.length - 1);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testQuickSortWithDuplicateValues() {
        int[] inputArray = {5, 2, 9, 1, 5, 6, 2};
        int[] expectedArray = {1, 2, 2, 5, 5, 6, 9};
        QuickSort.quickSort(inputArray, 0, inputArray.length - 1);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testQuickSortWithEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};
        QuickSort.quickSort(inputArray, 0, inputArray.length - 1);
        assertArrayEquals(expectedArray, inputArray);
    }
}
