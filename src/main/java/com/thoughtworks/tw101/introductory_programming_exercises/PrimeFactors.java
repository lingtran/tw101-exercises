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

    private int workingInteger;
    private List<Integer> list;

    private static Set<Integer> generate(int n) {
        PrimeFactors primeFactors = new PrimeFactors(n);

        if(n == 1) {
            return null;
        }

        primeFactors.pruneCompositeNumbersByDividingByTwos();
        primeFactors.divideByOddNumbers();
        primeFactors.addIfGreaterThanTwo();

        return new HashSet(primeFactors.getList());
    }

    public PrimeFactors(int n) {
        this.workingInteger = n;
        this.list = new ArrayList<>();
    }

    public List<Integer> getList() {
        return list;
    }

    private void pruneCompositeNumbersByDividingByTwos() {
        while(workingInteger % 2 == 0) {
            list.add(2);
            workingInteger /= 2;
        }
    }

    private void divideByOddNumbers() {
        for(int i = 3; i <= Math.sqrt(workingInteger); i += 2) {
            while(workingInteger%i ==0){
                list.add(i);
                workingInteger /= i;
            }
        }
    }

    private void addIfGreaterThanTwo() {
        if(workingInteger > 2) { list.add(workingInteger); }
    }
}
