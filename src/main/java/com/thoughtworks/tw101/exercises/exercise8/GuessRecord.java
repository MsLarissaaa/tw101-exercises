package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

class GuessRecord {
    private ArrayList<Integer> record = new ArrayList<>();

    void addGuess(int guess){
        record.add(guess);
    }

    void printGuesses(){
        System.out.println("Here is the list of your guesses: ");
        for(int guess: record){
            if(guess < 1 || guess > 100){
                System.out.println("Invalid guess");
            }
            else{
                System.out.println(guess);
            }
        }
        System.out.println("Congratulations on guessing correctly!");
    }
}
