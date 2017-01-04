package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        if(!primeFactors.isEmpty()){
            System.out.print("The prime factor(s) of this number is/are: ");
            for(int primeFact: primeFactors){
                System.out.print(primeFact + " ");
            }
        } else {
            System.out.println("Sorry, this number doesn't have any prime factors.");
        }
    }

    private static List<Integer> generate(int n) {
        List<Integer> all_factors = find_factors(n);
        for(int j = all_factors.size() - 1; j >= 0; j--){
            if(!is_prime(all_factors.get(j))){
                all_factors.remove(j);
            }
        }
        return all_factors;
    }

    private static boolean is_prime(int number){
        List<Integer> factors = find_factors(number);
        return ((factors.size() == 0) && (number > 1));
    }

    private static List<Integer> find_factors(int num) {
        List<Integer> found_factors = new ArrayList<>();
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                found_factors.add(i);
            }
        }
        return found_factors;
    }
}
