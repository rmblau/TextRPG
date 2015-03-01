package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public abstract class Character {
    protected int maxHealth;
    protected int health;
    protected int strength;
    protected int defense;
    protected String name;


    public boolean didMiss(){
        int n = (int) (Math.random() * 100);
        if (n > 66){
            return true;
        }
        else {
            return false;
        }
    }
    public int takeDamage(int strengthLevel){
        float defensePercentage = (float) defense / 100.0f;
        float damageToTake = strengthLevel - (defensePercentage * strengthLevel);
        int damage = Math.round(damageToTake);
        if(damage <= 0){
            damage = 1;
        }
        health -= damage;
        return damage;

    }
    public int attack(Character other){
        if(didMiss()){
            System.out.println(name +"'s attack missed!");
            return -1;
        }
        else{
            int n = other.takeDamage(strength);
            return n;
        }
    }
    public boolean isDead(){
        return health <=0;
    }

    //getters
    public int getDefense() {
        return defense;
    }

    public int getStrength() {

        return strength;
    }


    public int getHealth() {

        return health;
    }
    public void heal(){
        health = maxHealth;
    }
    public String getName(){
        return name;
    }
}
