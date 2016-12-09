package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    private int sum;

    private void setSum(int newValue) {
        this.sum += newValue;
    }

    private int getSum() {
        return sum;
    }

    private void calculateSumOf(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                setSum(i);
            }
        }
    }

    public int of(int start, int end) {
        calculateSumOf(start, end);
        return getSum();
    }
}
