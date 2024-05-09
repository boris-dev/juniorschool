package ru.liga.dcs.badcode.lesson10.good;

class TransactionHistoryService {
    // Получение массива транзакций клиента, возможно из базы данных или API
    public double[] getTransactionHistory() {
        // Это упрощенный пример. В реальной ситуации здесь могут быть запросы к базе данных или API
        return new double[]{200.0, 450.0, 120.0, 980.0, 500.0};  // Пример истории транзакций
    }

    // Расчет средней суммы транзакций на основе истории
    public double getAverageTransactionAmount() {
        double[] transactions = getTransactionHistory();
        double sum = 0;
        for (double transaction : transactions) {
            sum += transaction;
        }
        return transactions.length > 0 ? sum / transactions.length : 0;
    }
}
