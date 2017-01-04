package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 1; i < (n * 2); i +=2){
            for (int k = 0; k < (n - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        for (int i = 1; i < (n * 2); i +=2){
            for (int k = 0; k < (n - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = (n*2) - 3; i > 0; i -=2){
            for (int k = 0; k < (n - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for (int i = 1; i < (n * 2); i +=2){
            for (int k = 0; k < (n - (i / 2)); k++){
                System.out.print(" ");
            }
            if(i == ((n * 2) - 1)) {
                System.out.print("Larissa");
            } else {
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = (n*2) - 3; i > 0; i -=2){
            for (int k = 0; k < (n - (i / 2)); k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
