package collections;

import colections.CharacterFrequencyCounter;
import org.junit.Assert;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CharacterFrequencyCounterTest {
    CharacterFrequencyCounter characterFrequencyCounter = new CharacterFrequencyCounter();
    @Test
    public void testPrintCharacterFrequency() {
        HashMap<Character, Integer> outputHashMap =
                characterFrequencyCounter.
                        printCharacterFrequency("test string");

        Assert.assertEquals(3, outputHashMap.get('t').intValue());
    }
}
