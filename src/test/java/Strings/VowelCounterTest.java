package Strings;

import org.junit.Test;
import strings.VowelCounter;

import static org.junit.Assert.*;

public class VowelCounterTest {

    @Test
    public void testCountVowels() {
        assertEquals(5, VowelCounter.countVowels("Hello, how are you?"));
    }

    @Test
    public void testCountVowelsWithNoVowels() {
        assertEquals(0, VowelCounter.countVowels("Hll, hw r y?"));
    }

    @Test
    public void testCountVowelsWithEmptyString() {
        assertEquals(0, VowelCounter.countVowels(""));
    }

    @Test
    public void testCountVowelsWithAllVowels() {
        assertEquals(10, VowelCounter.countVowels("aeiouAEIOU"));
    }

    @Test
    public void testCountVowelsWithUpperCaseVowels() {
        assertEquals(5, VowelCounter.countVowels("AEIOU"));
    }

    @Test
    public void testCountVowelsWithLowerCaseVowels() {
        assertEquals(5, VowelCounter.countVowels("aeiou"));
    }
}
