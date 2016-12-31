package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrimeFactors {
    public static void main(String[] args) {
        Set<Integer> primeFactors = generate(30);
        System.out.println(primeFactors);
    }

    private static Set<Integer> generate(int n) {
        List<Integer> primeFactors = new ArrayList<>();

        if(n == 1) {
            return null;
        }


        n = pruneCompositeNumbersByDividingIntegerByTwos(n, primeFactors);
        n = divideIntegerByOddNumbers(n, primeFactors);
        addIntegerAsPrimeNumberGreaterThanTwo(n, primeFactors);

        return new HashSet(primeFactors);
    }

    private static int pruneCompositeNumbersByDividingIntegerByTwos(int n, List<Integer> primeFactors) {
        while(n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        return n;
    }


    private static int divideIntegerByOddNumbers(int n, List<Integer> primeFactors) {
        for(int i = 3; i <= Math.sqrt(n); i+=2) {
            while(n%i ==0){
                primeFactors.add(i);
                n /= i;
            }
        }
        return n;
    }

    private static int addIntegerAsPrimeNumberGreaterThanTwo(int n, List<Integer> primeFactors) {
        if(n > 2) {
            primeFactors.add(n);
        }

        return n;
    }
}
