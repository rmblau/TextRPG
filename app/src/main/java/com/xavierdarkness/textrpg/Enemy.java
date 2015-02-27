package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/26/15.
 */
public class Enemy{

    //fields
    private int maxHealth;
    private int health;
    private int strength;
    private int defense;

    //private constructor
    private Enemy(int health, int strength, int defense){
        maxHealth = health;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
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



    public void takeDamage(int strengthLevel){
        float defensePercentage = (float) defense / 100.0f;
        float damageToTake = strengthLevel - (defensePercentage * strengthLevel);
        int damage = Math.round(damageToTake);
        if(damage <= 0){
            damage = 1;
        }
        health -= damage;
        
    }

    public static Enemy getInstance(int id){
        switch(id){
            case 0:
                return new Enemy(50, 10, 10);
            case 1:
                return new Enemy(80, 5, 40);
            case 2:
                return new Enemy(100, 50, 20);
            default:
                return new Enemy(50, 10, 10);
        }
    }//end getInstance(int id)

}//end class