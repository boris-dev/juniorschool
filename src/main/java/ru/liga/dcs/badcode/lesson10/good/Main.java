package ru.liga.dcs.badcode.lesson10.good;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ExternalEconomicService economicService = new ExternalEconomicService();
        TransactionHistoryService historyService = new TransactionHistoryService();
        CreditRatingCalculationService calculationService = new CreditRatingCalculationService(economicService, historyService);
        OutputService outputService = new OutputService();
        CreditRatingService creditService = new CreditRatingService(calculationService, outputService);

        ClientProfile client = new ClientProfile(20000, LocalDate.of(1985, 5, 15), 1.75, 70);  // Пример параметров клиента
        creditService.updateClientCreditRating(client);
    }
}
