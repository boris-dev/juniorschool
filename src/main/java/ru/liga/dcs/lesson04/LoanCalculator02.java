package ru.liga.dcs.lesson04;

public class LoanCalculator02 {

    /**
     * Расчет ежемесячного платежа по кредиту.
     * <p>
     * Этот метод рассчитывает ежемесячный платеж, исходя из основной суммы кредита {@code principal},
     * годовой процентной ставки {@code annualRate} и срока кредита в годах {@code termInYears}.
     * Расчет выполняется по формуле аннуитетного платежа.
     * <p>
     * Формула аннуитетного платежа:
     * P = (r*PV) / (1 - (1 + r)^-n)
     * где P - ежемесячный платеж,
     * r - ежемесячная процентная ставка (годовая ставка / 12),
     * PV - основная сумма кредита (present value),
     * n - общее количество платежей (срок кредита в годах * 12).
     * <p>
     * Параметры:
     * @param principal основная сумма кредита, должна быть больше 0.
     * @param annualRate годовая процентная ставка в десятичной форме, должна быть неотрицательной.
     * @param termInYears срок кредита в годах, должен быть больше 0.
     * @return Ежемесячный платеж.
     * @throws IllegalArgumentException если principal <= 0, annualRate < 0 или termInYears <= 0.
     */
    public static double calculateMonthlyPayment(double principal, double annualRate, int termInYears) {
        return 0.0;
    }
}
