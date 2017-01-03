package com.thoughtworks.tw101.exercises.exercise8;


class Comparison {
    private int secretNumber;
    private boolean win = false;

    Comparison(int randomNumber){
        secretNumber = randomNumber;
    }

    void runCompareLoop(GuessRecord record){
        while(!win) {
            int guess = new Guess().guess;
            record.addGuess(guess);
            if (guess == secretNumber) {
                win = true;
            } else if (guess > 100 || guess < 1){
                System.out.println("Make sure your guess is an integer between 1 and 100!");
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high. Try again!");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low. Have another guess!");
            }
        }
    }
}