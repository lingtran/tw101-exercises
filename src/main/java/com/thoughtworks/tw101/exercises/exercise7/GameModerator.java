package com.thoughtworks.tw101.exercises.exercise7;

public class GameModerator {
    private int randomizedNumber;
    private final String welcomeMessage = "Hi! I have a number in mind. Enter your first guess:\n";
    private final String guessHighMessage = "\nYour guess is too high. Try again!";
    private final String guessLowMessage = "\nYour guess is too low. Try again!";
    private final String congratulatoryMessage = "\nHooray! You guessed correctly.";
    private final String farewellMessage = "\nFarewell, friend. Nice work today.";
    private boolean gameInProgress = true;

    public void setRandomizedNumber() {
        this.randomizedNumber = Randomizer.getNumber();
    }

    public void welcomesPlayer() {
        System.out.println(welcomeMessage);
    }

    public void checkPlayerGuess(int guessedNumber) {
        if(guessedNumber < randomizedNumber) {
            continueTheGame(guessLowMessage);
        } else if(guessedNumber > randomizedNumber) {
            continueTheGame(guessHighMessage);
        } else {
            endTheGame();
        }
    }

    public boolean maintainGameIsInProgress() {
        return this.gameInProgress;
    }

    public void bidFarewell() {
        System.out.println(farewellMessage);
    }

    private void continueTheGame(String message) {
        System.out.println(message);
    }

    private void endTheGame() {
        System.out.println(congratulatoryMessage);
        this.gameInProgress = false;
    }
}
