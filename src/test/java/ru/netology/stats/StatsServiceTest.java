package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSumSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void souldCalculateAverageSales() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateMaxSalesMonth() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateMinSalesMonth() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateCountMonthUnderAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateCountMonthUnderAverage(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateCountMonthOverAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateCountMonthOverAverage(sales);
        assertEquals(expected, actual);
    }
}