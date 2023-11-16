package com.workinthec.oop;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.name = name;
        this.weapon = weapon;

    }

    public int healthRemaining(int healthPercentage) {
        return this.healthPercentage;
    }

    public int loseHealth(int damage) {
        if (healthPercentage - damage < 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        return this.healthPercentage = healthPercentage - damage;
    }

    public int restoreHealth(int healthPotion) {
        if (healthPercentage + healthPotion > 100) {
            this.healthPercentage = 100;
        }
        return this.healthPercentage = this.healthPercentage + healthPotion;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
