package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.


public class Main {

    public static void main(String[] args) {
        int randomNumber = 1 + (int) (Math.random() * 100);
        System.out.println("(Shhh! The secret number we're having you guess is: " + randomNumber + ")");
        Comparison comparison = new Comparison(randomNumber);
        GuessRecord record = new GuessRecord();
        System.out.println("Guess a number between 1 and 100: ");
        comparison.runCompareLoop(record);
        System.out.println("That's correct! Great job! The number was " + randomNumber + " :)");
        record.printGuesses();
    }

}