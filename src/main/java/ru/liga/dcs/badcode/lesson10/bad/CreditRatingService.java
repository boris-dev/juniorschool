package ru.liga.dcs.badcode.lesson10.bad;

class CreditRatingService {
    private final CreditRatingCalculationService calculationService = new CreditRatingCalculationService();
    private final OutputService outputService = new OutputService();

    public void updateClientCreditRating(ClientProfile client) {
        calculationService.calculateCreditRating(client, outputService);
    }
}

