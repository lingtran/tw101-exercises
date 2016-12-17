package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {
    public static void main(String[] args) {
        GameModerator moderator = new GameModerator();
        Player player = new Player();
        Recorder recorder = new Recorder();

        moderator.setNumber();
        moderator.welcomesPlayer();

        while(moderator.maintainGameIsInProgress()) {
            try {
                Integer guess = player.guess();
                recorder.collectGuess(guess);
                moderator.checkPlayerGuess(guess);

            } catch(NumberFormatException e) {
                System.out.println("\nOops! Enter a number as a numeral rather than a word. No need for quotation marks!\n\tValid example: 2.\n\tInvalid examples: Two, '2'.\nTry again.\n");
            }
        }

        recorder.printGuesses();
        moderator.bidFarewell();
        player.leaves();
    }
}
