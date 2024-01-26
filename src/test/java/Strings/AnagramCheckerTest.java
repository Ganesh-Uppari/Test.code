package Strings;

import org.junit.Test;
import strings.AnagramChecker;

import static org.junit.Assert.*;

public class AnagramCheckerTest {

    @Test
    public void testAreAnagrams() {
        assertTrue(AnagramChecker.areAnagrams("listen", "silent"));
        assertFalse(AnagramChecker.areAnagrams("hello", "world"));
    }

    @Test
    public void testAreAnagramsDifferentLength() {
        assertFalse(AnagramChecker.areAnagrams("abc", "abcd"));
    }

    @Test
    public void testAreAnagramsIgnoreCase() {
        assertTrue(AnagramChecker.areAnagrams("Listen", "Silent"));
    }

    @Test
    public void testAreAnagramsEmptyStrings() {
        assertTrue(AnagramChecker.areAnagrams("", ""));
    }

    @Test
    public void testAreAnagramsNullStrings() {
        assertFalse(AnagramChecker.areAnagrams(null, "silent"));
        assertFalse(AnagramChecker.areAnagrams("listen", null));
        assertTrue(AnagramChecker.areAnagrams(null, null));
    }
}
