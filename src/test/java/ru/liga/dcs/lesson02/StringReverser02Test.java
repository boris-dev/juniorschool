package ru.liga.dcs.lesson02;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class StringReverser02Test {

    @Test
    public void testReverseWordsWithRegularSentence() {
        StringReverser02 reverser = new StringReverser02();
        String result = reverser.reverseWords("Привет, как дела?");
        assertThat(result).isEqualTo("дела? как Привет,");
    }

    @Test
    public void testReverseWordsWithSingleWord() {
        StringReverser02 reverser = new StringReverser02();
        String result = reverser.reverseWords("Привет");
        assertThat(result).isEqualTo("Привет");
    }

    @Test
    public void testReverseWordsWithEmptyString() {
        StringReverser02 reverser = new StringReverser02();
        String result = reverser.reverseWords("");
        assertThat(result).isEmpty();
    }

    @Test
    public void testReverseWordsWithMultipleSpaces() {
        StringReverser02 reverser = new StringReverser02();
        String result = reverser.reverseWords("  Привет   мир  ");
        assertThat(result).isEqualTo("  мир   Привет  ");
    }

    @Test(expected = NullPointerException.class)
    public void testReverseWordsWithNull() {
        StringReverser02 reverser = new StringReverser02();
        reverser.reverseWords(null);
    }
}