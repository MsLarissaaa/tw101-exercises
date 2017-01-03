package com.thoughtworks.tw101.exercises.exercise7;


class Comparison {
    private int secretNumber;
    private boolean win = false;

    Comparison(int randomNumber){
        secretNumber = randomNumber;
    }

    void runCompareLoop(){
        while(win == false) {
            int guess = new Guess().guess;
            if (guess == secretNumber) {
                win = true;
            } else if (guess > secretNumber) {
                System.out.println("Your guess is too high. Try again!");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low. Have another guess!");
            }
        }
        System.out.println("That's correct! Great job! The number was " + secretNumber + " :)");
    }

}
