package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        // given n = 30;
        // factors = 1, 30, 3, 10, 5, 6, 2, 15
        // prime factors = 2, 3, 5

        // start from 2 because that is the first prime number; add 2 to collection; then n/=2
        // then iterate with remaining prime numbers starting with 3, until Math.sqrt(n); increment i+=2
            // while n % i == 0, add i to collection; continue to n/=i;
        return null;
    }
}
