package ru.liga.dcs.badcode.lesson10.good;

class CreditRatingCalculationService {
    private ExternalEconomicService economicService;
    private TransactionHistoryService historyService;

    public CreditRatingCalculationService(ExternalEconomicService economicService, TransactionHistoryService historyService) {
        this.economicService = economicService;
        this.historyService = historyService;
    }

    public double calculateCreditRating(ClientProfile client) {
        double averageTransaction = historyService.getAverageTransactionAmount();
        double economicIndex = economicService.getEconomicIndex(averageTransaction);
        double bmi = client.getBMI();
        int age = client.getAge();

        // Расчет кредитного рейтинга с учетом ИМТ и возраста
        return client.getBalance() / economicIndex * averageTransaction * (1 - bmi / 100) * (age / 100.0);
    }
}
