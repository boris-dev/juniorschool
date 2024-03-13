package ru.liga.dcs.lesson06;

import java.util.*;

public class TransactionAnalyzer03 {
    /**
     * Определяет подозрительные транзакции из списка на основе заданных критериев.
     * <p>
     * Подозрительная транзакция может быть определена по нескольким критериям:
     * - Сумма транзакции превышает заданный пороговый предел.
     * - Транзакция происходит в необычное время (например, в ночные часы).
     * - Транзакция происходит в стране, отличной от страны проживания клиента.
     * <p>
     * Метод возвращает список транзакций, которые соответствуют хотя бы одному из вышеуказанных критериев.
     *
     * @param transactions    список транзакций для анализа.
     * @param thresholdAmount пороговая сумма, выше которой транзакция считается подозрительной.
     * @return список подозрительных транзакций.
     * @throws NullPointerException если переданный список транзакций равен null.
     */
    public static List<Transaction> detectSuspiciousTransactions(List<Transaction> transactions, double thresholdAmount) {
        return Collections.emptyList();
    }

}
