package com.thoughtworks.tw101.exercises.exercise8;

public class GameModerator {
    private boolean gameInProgress = true;
    private int randomizedNumber;

    public void setNumber() {
        this.randomizedNumber = Randomizer.getNumber();
    }

    private enum Message {
        welcome("Hi! I have a number in mind. Enter your first guess:\n"), guessHigh("\nYour guess is too high. Try again!"), guessLow("\nYour guess is too low. Try again!"), congratualtory("\nHooray! You guessed correctly."), farewell("\nFarewell, friend. Nice work today.");

        private String content;

        Message(String content) {
            this.content = content;
        }
    }

    public void welcomesPlayer() {
        System.out.println(Message.welcome.content);
    }

    public boolean maintainGameIsInProgress() { return this.gameInProgress; }

    private void continueTheGame(String message) {
        System.out.println(message);
    }

    private void endTheGame() {
        System.out.println(Message.congratualtory.content);
        this.gameInProgress = false;
    }

    public void checkPlayerGuess(int guessedNumber) {
        if(guessedNumber < randomizedNumber) {
            continueTheGame(Message.guessLow.content);
        } else if(guessedNumber > randomizedNumber) {
            continueTheGame(Message.guessHigh.content);
        } else {
            endTheGame();
        }
    }

    public void bidFarewell() {
        System.out.println(Message.farewell.content);
    }

}
