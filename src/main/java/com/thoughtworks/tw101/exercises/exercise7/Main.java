package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.


public class Main {

    public static void main(String[] args) {
        int randomNumber = 1 + (int) (Math.random() * 100);
        System.out.println("(Shhh! The secret number we're having you guess is: " + randomNumber + ")");
        Comparison comparison = new Comparison(randomNumber);
        comparison.runCompareLoop();
    }

}
