package ru.liga.dcs.lesson04;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Класс для конвертации валют.
 */
public class CurrencyConverter03 {

    /**
     * Конвертирует сумму денег из одной валюты в другую.
     * <p>
     * Использует {@link BigDecimal} для высокой точности вычислений и предотвращения ошибок округления.
     * Результат округляется до двух десятичных знаков согласно стандартному методу округления {@link RoundingMode#HALF_UP}.
     * <p>
     * @param amount сумма для конвертации, не должна быть null и должна быть неотрицательной.
     * @param exchangeRate курс обмена, не должен быть null и должен быть больше 0.
     * @return Конвертированная сумма, округленная до двух десятичных знаков.
     * @throws IllegalArgumentException если amount или exchangeRate недействительны. Ошибка включает в себя информацию о недействительных значениях.
     */
    public static BigDecimal convertCurrency(BigDecimal amount, BigDecimal exchangeRate) {

        return BigDecimal.ZERO;
    }
}
