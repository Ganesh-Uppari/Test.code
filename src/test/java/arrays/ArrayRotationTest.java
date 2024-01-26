package arrays;

import arrays.ArrayRotation;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class ArrayRotationTest {

    @Test
    public void testRotateLeft() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotation.rotateLeft(arr, 2);
        int[] expected = {3, 4, 5, 6, 7, 1, 2};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRotateLeftWithZeroPositions() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotation.rotateLeft(arr, 0);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRotateLeftWithNegativePositions() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotation.rotateRight(arr, -2);
        int[] expected = {6, 7, 1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRotateLeftWithLargePositions() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrayRotation.rotateLeft(arr, 10);
        int[] expected = {4,5,6,7,1,2,3};
        assertArrayEquals(expected, arr);
    }
}
