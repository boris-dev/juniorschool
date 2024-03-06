package ru.liga.dcs.lesson05;

/**
 * Класс для генерации и проверки сложности пароля.
 */
public class PasswordGenerator05 {

    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+";
    private static final int MINIMUM_LENGTH = 8;


    /**
     * Генерирует случайный сложный пароль заданной длины.
     *
     * @param length длина генерируемого пароля.
     * @return сгенерированный сложный пароль.
     */
    public String generateStrongPassword(int length) {
        return "";
    }

    /**
     * Проверяет, является ли пароль сложным. Сложный пароль должен быть не менее
     * 8 символов в длину и содержать как минимум одну цифру, одну прописную букву,
     * одну строчную букву и один специальный символ.
     *
     * @param password пароль для проверки
     * @return true, если пароль сложный; иначе false
     */
    public boolean isPasswordStrong(String password) {
        if (password.length() < MINIMUM_LENGTH) {
            return false;
        }

        boolean hasLower = false, hasUpper = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (LOWER_CASE.contains(String.valueOf(ch))) {
                hasLower = true;
            } else if (UPPER_CASE.contains(String.valueOf(ch))) {
                hasUpper = true;
            } else if (DIGITS.contains(String.valueOf(ch))) {
                hasDigit = true;
            } else if (SPECIAL_CHARACTERS.contains(String.valueOf(ch))) {
                hasSpecial = true;
            }
        }

        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}
