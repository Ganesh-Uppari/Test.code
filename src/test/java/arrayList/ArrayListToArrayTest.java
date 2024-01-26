package arrayList;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;

public class ArrayListToArrayTest {

    @Test
    public void testArrayListToArray() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");

        String[] expectedArray = {"Element 1", "Element 2", "Element 3"};

        String[] resultArray = ArrayListToArray.convertArrayListToArray(stringList);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testArrayListToArrayWithEmptyList() {
        ArrayList<String> stringList = new ArrayList<>();

        String[] expectedArray = {};

        String[] resultArray = ArrayListToArray.convertArrayListToArray(stringList);

        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testArrayListToArrayWithNullList() {
        ArrayList<String> stringList = null;

        // Expecting null because the input list is null
        String[] resultArray = ArrayListToArray.convertArrayListToArray(stringList);

        assertArrayEquals(null, resultArray);
    }
}
