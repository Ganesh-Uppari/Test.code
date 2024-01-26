package arrays;

import arrays.ArrayMinMax;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ArrayMinMaxTest {

    @Test
    public void testFindLargest() {
        int[] numbers = {12, 5, 23, 8, 17, 9, 31, 15};
        int largest = ArrayMinMax.findLargest(numbers);
        assertEquals(31, largest);
    }

    @Test
    public void testFindSmallest() {
        int[] numbers = {12, 5, 23, 8, 17, 9, 31, 15};
        int smallest = ArrayMinMax.findSmallest(numbers);
        assertEquals(5, smallest);
    }

    @Test
    public void testFindLargestWithNegativeNumbers() {
        int[] numbers = {-12, -5, -23, -8, -17, -9, -31, -15};
        int largest = ArrayMinMax.findLargest(numbers);
        assertEquals(-5, largest);
    }

    @Test
    public void testFindSmallestWithNegativeNumbers() {
        int[] numbers = {-12, -5, -23, -8, -17, -9, -31, -15};
        int smallest = ArrayMinMax.findSmallest(numbers);
        assertEquals(-31, smallest);
    }

    @Test
    public void testFindLargestWithSingleElement() {
        int[] numbers = {7};
        int largest = ArrayMinMax.findLargest(numbers);
        assertEquals(7, largest);
    }

    @Test
    public void testFindSmallestWithSingleElement() {
        int[] numbers = {7};
        int smallest = ArrayMinMax.findSmallest(numbers);
        assertEquals(7, smallest);
    }
}
