package ru.liga.dcs.lesson06;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class StringUtilTest {

    @Test
    public void testSumNumbersInString_withNumbers() {
        assertThat(StringUtil04.sumNumbersInString("he33llo 42 I'm a 32 string 30")).isEqualTo(137);
    }

    @Test
    public void testSumNumbersInString_noNumbers() {
        assertThat(StringUtil04.sumNumbersInString("hello world")).isEqualTo(0);
    }

    @Test
    public void testSumNumbersInString_emptyString() {
        assertThat(StringUtil04.sumNumbersInString("")).isEqualTo(0);
    }

    @Test(expected = NullPointerException.class)
    public void testSumNumbersInString_nullInput() {
        StringUtil04.sumNumbersInString(null);
    }

    // Дополнительные тесты могут быть добавлены для проверки различных сценариев
}
