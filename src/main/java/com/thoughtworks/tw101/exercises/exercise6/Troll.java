package com.thoughtworks.tw101.exercises.exercise6;


public class Troll implements Monster {
    private String name;
    private float hitpoints;

    Troll(String name){
        this.name = name;
        hitpoints = (float) 40.0;
    }

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount * (float) 0.5;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " currently has " + hitpoints + " hitpoints.");
    }
}
