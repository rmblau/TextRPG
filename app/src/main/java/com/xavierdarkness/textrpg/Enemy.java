package com.xavierdarkness.textrpg;


public class Enemy extends Character{
    //private constructor
    protected Enemy(String name, int health, int strength, int defense){
        maxHealth = health + (int) (health * .1 * level);
        this.health = health + (int) (health * .1 * level);
        this.strength = strength + (int) (strength *.1 * level);
        this.defense = defense + (int) (defense *.1 * level);
        this.name = name;
    }

    public static Enemy getInstance(int id){
        switch(id){
            case 0:
                //health, strength, defense
                return new Enemy("Orc",50, 10, 10);
            case 1:
                return new Enemy("wizard",80, 50, 40);
            case 2:
                return new Enemy("Zombie",100, 50, 20);
            default:
                return new Enemy("Vampire",50, 10, 10);
        }
    }//end getInstance(int id)

}//end class