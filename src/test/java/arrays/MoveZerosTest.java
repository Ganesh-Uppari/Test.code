package arrays;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MoveZerosTest {

    @Test
    public void testMoveZeros() {
        int[] inputArray = {0, 1, 0, 3, 12};
        int[] expectedArray = {1, 3, 12, 0, 0};
        MoveZeros.moveZeros(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testMoveZerosWithNoZeros() {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        MoveZeros.moveZeros(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testMoveZerosWithAllZeros() {
        int[] inputArray = {0, 0, 0, 0, 0};
        int[] expectedArray = {0, 0, 0, 0, 0};
        MoveZeros.moveZeros(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    @Test
    public void testMoveZerosWithEmptyArray() {
        int[] inputArray = {};
        int[] expectedArray = {};
        MoveZeros.moveZeros(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }
}
