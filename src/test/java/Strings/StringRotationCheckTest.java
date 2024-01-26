package Strings;

import org.junit.Test;
import strings.StringRotationCheck;

import static org.junit.Assert.*;

public class StringRotationCheckTest {

    @Test
    public void testIsRotation() {
        assertTrue(StringRotationCheck.isRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));
        assertFalse(StringRotationCheck.isRotation("HelloWorld", "WorldHello"));
    }

    @Test
    public void testIsRotationWithEmptyStrings() {
        assertFalse(StringRotationCheck.isRotation("", ""));
    }

    @Test
    public void testIsRotationWithDifferentLengths() {
        assertFalse(StringRotationCheck.isRotation("abc", "abcd"));
    }

    @Test
    public void testIsRotationWithSingleCharacter() {
        assertTrue(StringRotationCheck.isRotation("A", "A"));
    }

    @Test
    public void testIsRotationWithNonRotation() {
        assertFalse(StringRotationCheck.isRotation("abc", "bca"));
    }
}
