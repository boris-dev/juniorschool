package ru.liga.dcs.badcode.lesson10.bad;

import java.time.LocalDate;
import java.time.Period;

// Доменный класс профиля клиента
class ClientProfile {
    public double balance;
    public LocalDate birthDate;
    public double height; // Рост в метрах
    public double weight; // Вес в килограммах

    public ClientProfile(double balance, LocalDate birthDate, double height, double weight) {
        this.balance = balance;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
    }

    public double getBalance() {
        return balance;
    }
}

