package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    private Integer sum;

    private void setSum(int i) {
        sum += i;
    }

    private int getSum() {
        return sum;
    }

    public int of(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 != 0) {
                setSum(i);
            }
        }
        return getSum();
    }
}
