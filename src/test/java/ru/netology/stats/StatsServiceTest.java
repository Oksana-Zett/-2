package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        long [] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(monthSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldAverageSum() {
        StatsService service = new StatsService();
        long [] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAverageSum(monthSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumMaxMonthSum() {
        StatsService service = new StatsService();
        long [] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.numMaxMonthSum(monthSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldNumMinMonthSum() {
        StatsService service = new StatsService();
        long [] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.numMinMonthSum(monthSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCountMinMonthAvgSum() {
        StatsService service = new StatsService();
        long [] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countMinMonthAvgSum(monthSales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCountMaxMonthAvgSum() {
        StatsService service = new StatsService();
        long [] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countMaxMonthAvgSum(monthSales);

        assertEquals(expected, actual);
    }
}