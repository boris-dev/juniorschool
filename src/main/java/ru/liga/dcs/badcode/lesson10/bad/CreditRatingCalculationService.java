package ru.liga.dcs.badcode.lesson10.bad;

import java.time.LocalDate;
import java.time.Period;

class CreditRatingCalculationService {
    private final ExternalEconomicService economicService = new ExternalEconomicService();
    private final TransactionHistoryService historyService = new TransactionHistoryService();

    public void calculateCreditRating(ClientProfile client, OutputService outputService) {
        double averageTransaction = historyService.getAverageTransactionAmount();
        double economicIndex = economicService.getEconomicIndex(averageTransaction);
        double bmi = client.weight / (client.height * client.height);
        int age = Period.between(client.birthDate, LocalDate.now()).getYears();
        // Расчет кредитного рейтинга с учетом ИМТ и возраста
        double rating = client.getBalance() / economicIndex * averageTransaction * (1 - bmi / 100) * (age / 100.0);
        outputService.sendCreditRating(rating);
    }
}
