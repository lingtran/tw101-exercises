package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int counter = 0;

    private int getCounter() {
        return counter;
    }

    void increment() {
        counter += 1;
    }

    void total() {
        System.out.println("#increment has been called " + getCounter() + " times");
    }
}
