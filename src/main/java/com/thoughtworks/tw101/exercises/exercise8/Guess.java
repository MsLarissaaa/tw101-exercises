package com.thoughtworks.tw101.exercises.exercise8;


import java.util.Scanner;

class Guess {
    int guess;

    Guess() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            guess = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            if(input.equals("")) {
                System.out.println("Empty input. Please enter a number.");
            } else {
                System.out.println("Whoops! Looks like you entered a string. Please enter an integer guess instead.");
            }
        }
    }
}
