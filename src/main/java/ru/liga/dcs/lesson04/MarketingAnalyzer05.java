package ru.liga.dcs.lesson04;

import ru.liga.dcs.lesson04.domain.Category;
import ru.liga.dcs.lesson04.domain.MarketingImportance;
import ru.liga.dcs.lesson04.domain.Product;

import java.util.*;

/**
 * Класс для анализа маркетинговых данных о продуктах в магазине.
 */
public class MarketingAnalyzer05 {


    /**
     * Конструктор, создающий анализатор маркетинга на основе списка продуктов.
     *
     * @param products список продуктов
     */
    public MarketingAnalyzer05(List<Product> products) {
    }

    /**
     * Вычисляет среднюю цену продуктов в указанной категории.
     *
     * @param category категория продуктов
     * @return средняя цена продуктов в указанной категории
     */
    public double calculateAveragePriceByCategory(Category category) {
        return 0.0;
    }

    /**
     * Находит самый дорогой продукт в указанной категории.
     *
     * @param category категория продуктов
     * @return самый дорогой продукт в указанной категории
     */
    public Product findMostExpensiveProductByCategory(Category category) {
        return null;
    }

    /**
     * Находит самый дешевый продукт в указанной категории.
     *
     * @param category категория продуктов
     * @return самый дешевый продукт в указанной категории
     */
    public Product findCheapestProductByCategory(Category category) {
        return null;
    }

    /**
     * Вычисляет важность каждой категории продуктов в магазине на основе их количества и средней стоимости.
     *
     * @return объект MarketingImportance, содержащий карту важности категорий
     */
    public MarketingImportance calculateCategoryImportance() {
        return null;
    }

}
