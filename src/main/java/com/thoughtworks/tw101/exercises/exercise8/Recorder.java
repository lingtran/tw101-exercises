package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class Recorder {
    private ArrayList<Integer> guesses = new ArrayList<>();

    public void collectGuess(Integer guess) {
        guesses.add(guess);
    }

    public void printGuesses() {
        System.out.println("Your guesses:");
        for(Integer guess: this.guesses) {
            System.out.printf("\t%d\n", guess);
        }
    }

}
