package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/26/15.
 */
public class Enemy extends Character{
    //private constructor
    private Enemy(int health, int strength, int defense){
        maxHealth = health;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
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