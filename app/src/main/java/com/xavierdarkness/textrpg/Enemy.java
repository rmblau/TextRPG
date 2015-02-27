package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/26/15.
 */
public class Enemy{

    //fields
    private int health;
    private int strength;
    private int defense;

    //private constructor
    private Enemy(int health, int strength, int defense){
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



    public void takeDamage(int d){
        health -= (defense -d);
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