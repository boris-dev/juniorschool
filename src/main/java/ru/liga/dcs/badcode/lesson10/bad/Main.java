package ru.liga.dcs.badcode.lesson10.bad;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CreditRatingService creditService = new CreditRatingService();
        ClientProfile client = new ClientProfile(20000, LocalDate.of(1985, 5, 15), 1.75, 70);  // Пример параметров клиента
        creditService.updateClientCreditRating(client);
    }
}
