package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12,5,8,4,5,3,8,6,11,11,12};
        long expected = 3;
        long actual = service.findMin(incomesInBillions);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findSame() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12,5,8,4,5,3,8,6,11,11,12};
        long expected = 12;
        long actual = service.findSame(incomesInBillions);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findMedian() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12,5,8,4,5,3,8,6,11,11,12};
        long expected = 12;
        long actual = service.findMedian(incomesInBillions);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void findSum() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12,5,8,4,5,3,8,6,11,11,12};
        long expected = 97;
        long actual = service.findSum(incomesInBillions);
        Assertions.assertEquals(expected,actual);
    }
}