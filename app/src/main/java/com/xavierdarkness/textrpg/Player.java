package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public class Player extends Character{
    //protected constructor
    protected Player(String name,int health, int strength, int defense){
        maxHealth = health + (int) (health * .1 * level);
        this.name = name;
        this.health = health + (int) (health * .1 * level);
        this.strength = strength + (int) (strength *.1 * level);
        this.defense = defense + (int) (defense *.1 * level);
    }
}//end class