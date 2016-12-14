package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private int hitPoints;
    private String name;
    private String reportMessage;

    public Troll() {
        this.hitPoints       = 40;
        this.name            = "Troll";
        this.reportMessage   = "%s has current hit points of %d\n";
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= (amount/2);
    }

    @Override
    public void reportStatus() {
        System.out.printf(reportMessage, name, hitPoints);
    }
}
