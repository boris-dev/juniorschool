package ru.liga.dcs.lesson05;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ListSumTest {

    /**
     * Тестирует sumList с непустым списком.
     */
    @Test
    public void testSumListWithNonEmptyList() {
        ListSum02 calculator = new ListSum02();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = calculator.sumList(numbers);
        assertThat(sum).isEqualTo(15);
    }

    /**
     * Тестирует sumList с пустым списком.
     */
    @Test
    public void testSumListWithEmptyList() {
        ListSum02 calculator = new ListSum02();
        List<Integer> numbers = Arrays.asList();
        int sum = calculator.sumList(numbers);
        assertThat(sum).isEqualTo(0);
    }

    /**
     * Тестирует sumList с null.
     */
    @Test(expected = NullPointerException.class)
    public void testSumListWithNull() {
        ListSum02 calculator = new ListSum02();
        calculator.sumList(null);
    }
}
