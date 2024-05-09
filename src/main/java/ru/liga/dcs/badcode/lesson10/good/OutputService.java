package ru.liga.dcs.badcode.lesson10.good;

class OutputService {
    public void sendCreditRating(double creditRating) {
        // Реализация отправки кредитного рейтинга во внешнюю систему, например, через REST API
        System.out.println("Credit Rating " + creditRating + " has been sent to the external system.");
    }
}
