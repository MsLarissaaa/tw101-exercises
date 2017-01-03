package com.thoughtworks.tw101.exercises.exercise6;


public class Orc implements Monster {
    private String name;
    private int hitpoints;

    Orc(String name){
        this.name = name;
        hitpoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " currently has " + hitpoints + " hitpoints.");
    }

}
