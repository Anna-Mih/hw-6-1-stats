package ru.netology.stats;

public class StatsService {
    //int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int calculateSumSales(int[] sales) {
        int sumSales = 0;
        for (int sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public int calculateAverageSales(int[] sales) {
        int averageSales = calculateSumSales(sales) / sales.length;
        return averageSales;
    }

    public int calculateMaxSalesMonth(int[] sales) {
        int maxMonth = 0; // продажа
        int month = 0; // индекс месяца
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month += 1;
        }
        return maxMonth + 1;
    }

    public int calculateMinSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month += 1;
        }
        return minMonth + 1;
    }

    public int calculateCountMonthUnderAverage(int[] sales) {
        int countMonth = 0;
        for (int sale : sales) {
            if (sale < calculateAverageSales(sales)) {
                countMonth += 1;
            }
        }
        return countMonth;
    }

    public int calculateCountMonthOverAverage(int[] sales) {
        int countMonth = 0;
        for (int sale : sales) {
            if (sale > calculateAverageSales(sales)) {
                countMonth += 1;
            }
        }
        return countMonth;
    }


}
