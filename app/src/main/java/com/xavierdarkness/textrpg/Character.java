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



    public void attack(Character other){
        other.takeDamage(strength);
    }
    public void takeDamage(int strengthLevel){
        float defensePercentage = (float) defense / 100.0f;
        float damageToTake = strengthLevel - (defensePercentage * strengthLevel);
        int damage = Math.round(damageToTake);
        if(damage <= 0){
            damage = 1;
        }
        health -= damage;

    }
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
