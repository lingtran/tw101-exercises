package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        this.scanner = new Scanner(System.in);
    }

    public Integer guessANumber() {
        return Integer.parseInt(scanner.next());
    }

    public void leaves() {
        scanner.close();
    }
}
