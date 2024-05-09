package ru.liga.dcs.badcode.lesson10.good;

class ExternalEconomicService {
    // Получение базового экономического индекса, возможно из внешнего API или базы данных
    public double getBaseEconomicIndex() {
        // Здесь могут быть вызовы к внешним системам для получения данных
        return 50;  // Пример значения, обычно это будет запрос к базе данных или внешнему API
    }

    // Корректировка экономического индекса на основе средней суммы транзакций
    public double getEconomicIndex(double averageTransaction) {
        double baseIndex = getBaseEconomicIndex();
        // Корректировка индекса с учетом средней суммы транзакций
        return baseIndex + averageTransaction * 0.01;  // Простое предположение для коррекции
    }
}
