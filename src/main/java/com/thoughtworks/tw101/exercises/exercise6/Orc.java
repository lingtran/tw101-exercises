package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private int hitPoints;
    private String name;
    private String reportMessage;

    public Orc() {
        this.hitPoints       = 20;
        this.name            = "Orc";
        this.reportMessage   = "%s has current hit points of %d\n";
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.printf(reportMessage, name, hitPoints);
    }
}
