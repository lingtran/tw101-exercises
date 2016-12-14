package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int hitPoints;
    private String name;

    public Troll() {
        this.hitPoints = 40;
        this.name = "Troll";
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= (amount/2);
    }

    @Override
    public void reportStatus() {
        System.out.printf("%s has current hit points of %d\n", name, hitPoints);
    }
}
