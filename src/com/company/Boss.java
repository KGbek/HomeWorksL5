package com.company;

public class Boss {
    private int health;
    private int damage;
    private String deffenseType;

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getDeffenseType() {
        return deffenseType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDeffenseType(String deffenseType) {
        this.deffenseType = deffenseType;
    }
}
