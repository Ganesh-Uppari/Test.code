package arrayList;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.ArrayList;

public class ArrayListTraversalTest {

    @Test
    public void testArrayListTraversal() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Element 1");
        stringList.add("Element 2");
        stringList.add("Element 3");
        stringList.add("Element 4");

        // Create an instance of ArrayListTraversal
        ArrayListTraversal arrayListTraversal = new ArrayListTraversal();

        // Test traversing using for loop
        assertEquals("Traversing using for loop is incorrect",
                Long.parseLong("Element 1\nElement 2\nElement 3\nElement 4\n")
        );

        // Test traversing using enhanced for loop
        assertEquals("Traversing using enhanced for loop is incorrect",
                "Element 1\nElement 2\nElement 3\nElement 4\n"
        );
    }
}

