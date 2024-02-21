package ru.liga.dcs.lesson03;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Тесты для класса TimeFormatter.
 */
public class TimeFormatterTest {

    @Test
    public void testConvertSecondsToTime_ZeroSeconds() {
        String result = TimeFormatter03.convertSecondsToTime(0);
        assertThat(result).isEqualTo("00:00:00");
    }

    @Test
    public void testConvertSecondsToTime_RegularTime() {
        String result = TimeFormatter03.convertSecondsToTime(3661);
        assertThat(result).isEqualTo("01:01:01");
    }

    @Test
    public void testConvertSecondsToTime_OneMinute() {
        String result = TimeFormatter03.convertSecondsToTime(60);
        assertThat(result).isEqualTo("00:01:00");
    }

    @Test
    public void testConvertSecondsToTime_OneHour() {
        String result = TimeFormatter03.convertSecondsToTime(3600);
        assertThat(result).isEqualTo("01:00:00");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertSecondsToTime_NegativeSeconds() {
        TimeFormatter03.convertSecondsToTime(-1);
    }
}
