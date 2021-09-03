package com.company;

public class Hero {
    private int health;
    private int damage;
    private int superAbility;

    public Hero(int health, int damage, int superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperAbility() {
        return superAbility;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", damage=" + damage +
                ", superAbility=" + superAbility +
                '}';
    }
}
