package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() { this.scanner = new Scanner(System.in); }

    public Integer guessNumber() { return Integer.parseInt(scanner.next()); }

    public void leaves() { scanner.close(); }
}
