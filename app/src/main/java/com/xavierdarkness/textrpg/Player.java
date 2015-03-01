package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public class Player extends Character{
    //protected constructor
    protected Player(String name, int health, int strength, int defense){
        maxHealth = health;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        this.name = name;
    }
}//end class