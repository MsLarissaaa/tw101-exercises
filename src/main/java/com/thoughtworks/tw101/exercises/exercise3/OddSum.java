package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    private int start;
    private int end;
    private int sum;

    public OddSum() {
        sum = 0;
    }

    private void setBounds(int first, int last){
        if (last > first) {
            end = last;
            start = first;
        }
        else {
            end = first;
            start = last;
        }
    }

    public int of(int start, int end) {
        setBounds(start, end);
        int number = this.start;

        while (number <= this.end){
            if (number % 2 == 1 || number % 2 == -1){
                sum += number;
            }
            number++;
        }
        return sum;
    }
}