package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(250);
        boss.setDeffenseType("");
        boss.setDamage(70);
        System.out.println("New Boss characteristic: health is " + boss.getHealth() + " damage " + boss.getDamage() + " deffense " + boss.getDeffenseType());


        createHeroes();
        for (Hero heroes : createHeroes()) {
            System.out.println(heroes);
        }


    }

    public static Hero[] createHeroes() {
        Hero Warrior = new Hero(230, 40, 60);
        Hero Magic = new Hero(160, 50, 80);
        Hero Paladin = new Hero(280, 70);


        return new Hero[]{Warrior,Magic,Paladin};
    }
}
