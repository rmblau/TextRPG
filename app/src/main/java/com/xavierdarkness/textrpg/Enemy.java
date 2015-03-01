package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/26/15.
 */
public class Enemy extends Character{
    //private constructor
    private Enemy(String name, int health, int strength, int defense){
        maxHealth = health;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.name = name;
    }
    public static Enemy getInstance(int id){
        switch(id){
            case 0:
                return new Enemy("Orc",50, 10, 10);
            case 1:
                return new Enemy("Goblin",80, 5, 40);
            case 2:
                return new Enemy("Zombie",100, 50, 20);
            default:
                return new Enemy("Vampire",50, 10, 10);
        }
    }//end getInstance(int id)

}//end class