package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;
    private String startCheckAnnouncer = "Checking for books containing %s...\n";
    private String result = "\tFound title: %s\n";

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        System.out.printf(startCheckAnnouncer, partialBookTitle);

        for(String book : books) {
            if( book.toLowerCase().contains(partialBookTitle.toLowerCase())) {
                System.out.printf(result, book);
            }
        }

    }
}
