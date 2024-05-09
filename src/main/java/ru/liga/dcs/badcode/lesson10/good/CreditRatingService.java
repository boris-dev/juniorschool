package ru.liga.dcs.badcode.lesson10.good;

class CreditRatingService {
    private CreditRatingCalculationService calculationService;
    private OutputService outputService;

    public CreditRatingService(CreditRatingCalculationService calculationService, OutputService outputService) {
        this.calculationService = calculationService;
        this.outputService = outputService;
    }

    public void updateClientCreditRating(ClientProfile client) {
        double creditRating = calculationService.calculateCreditRating(client);
        System.out.println("Updated Credit Rating: " + creditRating);
        outputService.sendCreditRating(creditRating);  // Делегирование задачи отправки рейтинга
    }
}

