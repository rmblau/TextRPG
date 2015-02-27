package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public class Character {
    //fields
    protected int maxHealth;
    protected int health;
    protected int strength;
    protected int defense;


    //getter and setter methods
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getStrength() {

        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }




}
