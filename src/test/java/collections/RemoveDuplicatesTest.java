package collections;

import org.junit.Test;

import static colections.RemoveDuplicates.removeDuplicates;
import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        // Test case with duplicate characters
        String inputString = "programming";
        String expectedOutput = "progamin";

        // Remove duplicates using LinkedHashSet
        String resultString = removeDuplicates(inputString);

        // Assert the result matches the expected output
        assertEquals(expectedOutput, resultString);
    }
}
