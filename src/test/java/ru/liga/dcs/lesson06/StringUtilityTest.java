package ru.liga.dcs.lesson06;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class StringUtilityTest {

    @Test
    public void testCanFormString_validCase() {
        assertThat(StringUtility02.canFormString("abcd", "dcba")).isTrue();
    }

    @Test
    public void testCanFormString_invalidCase() {
        assertThat(StringUtility02.canFormString("abcd", "abce")).isFalse();
    }

    @Test
    public void testCanFormString_emptyStrings() {
        assertThat(StringUtility02.canFormString("", "")).isTrue();
    }

    @Test(expected = NullPointerException.class)
    public void testCanFormString_nullInput() {
        StringUtility02.canFormString(null, "abc");
    }

    // Можно добавить дополнительные тесты для проверки других сценариев
}
