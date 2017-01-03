package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

class Guess {
    int guess;

    Guess() {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100: ");
        guess = input.nextInt();
    }

}


