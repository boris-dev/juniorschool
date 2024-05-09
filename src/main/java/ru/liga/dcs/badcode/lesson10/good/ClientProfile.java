package ru.liga.dcs.badcode.lesson10.good;

import java.time.LocalDate;
import java.time.Period;

// Доменный класс профиля клиента
class ClientProfile {
    private final double balance;
    private final LocalDate birthDate;
    private final double height; // Рост в метрах
    private final double weight; // Вес в килограммах

    public ClientProfile(double balance, LocalDate birthDate, double height, double weight) {
        this.balance = balance;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
    }

    public double getBalance() {
        return balance;
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}

