package ru.netology.statistic;

public class StatisticsService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income :incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
    public long findMin(long[] incomes) {
        long currentMin = incomes[0];
        for (long income : incomes) {
            if (currentMin > income) {
                currentMin = income;
            }
        }
        return currentMin;
    }
    public long findSame(long[] incomes) {
        long currentSame = incomes[0];
        for (long income : incomes) {
            if (currentSame == income) {
                currentSame = income;
            }
        }
        return currentSame;
    }
    public long findMedian(long[] incomes) {
        long currentMedian = incomes[0];
        for (long income : incomes) {
            if (currentMedian != income) {
               currentMedian = income;
            }
        }
        return currentMedian;
    }
    public long findSum(long[] incomes) {
        long currentSum = incomes[0];
        for (long income : incomes) {
            currentSum += income;
        }
        return currentSum;

    }
}
