package Strings;

import org.junit.Test;
import strings.ReverseWordsInSentence;

import static org.junit.Assert.assertEquals;

public class ReverseWordsInSentenceTest {

    @Test
    public void testReverseWordsInSentence() {
        String input = "Java J2EE Reverse Me";
        String output = ReverseWordsInSentence.reverseWordsInSentence(input);
        assertEquals("avaJ EE2J esreveR eM", output);
    }

    @Test
    public void testReverseWordsInSentenceWithEmptyString() {
        String input = "";
        String output = ReverseWordsInSentence.reverseWordsInSentence(input);
        assertEquals("", output);
    }

    @Test
    public void testReverseWordsInSentenceWithSingleWord() {
        String input = "Hello";
        String output = ReverseWordsInSentence.reverseWordsInSentence(input);
        assertEquals("olleH", output);
    }

    @Test
    public void testReverseWordsInSentenceWithMultipleSpaces() {
        String input = "   Java   J2EE   Reverse   Me   ";
        String output = ReverseWordsInSentence.reverseWordsInSentence(input);
        assertEquals("avaJ EE2J esreveR eM", output);
    }

    @Test
    public void testReverseWord() {
        String word = "Reverse";
        String reversedWord = ReverseWordsInSentence.reverseWord(word);
        assertEquals("esreveR", reversedWord);
    }

    @Test
    public void testReverseWordWithEmptyString() {
        String word = "";
        String reversedWord = ReverseWordsInSentence.reverseWord(word);
        assertEquals("", reversedWord);
    }

    @Test
    public void testReverseWordWithSingleCharacter() {
        String word = "A";
        String reversedWord = ReverseWordsInSentence.reverseWord(word);
        assertEquals("A", reversedWord);
    }
}
