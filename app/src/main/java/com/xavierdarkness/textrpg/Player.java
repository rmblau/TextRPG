package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public class Player extends Character{
    //private constructor
    protected Player(int health, int strength, int defense){
        maxHealth = health;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
    }

    public static Player getInstance(int id){
        switch(id){
            case 0:
                //health, strength, defense
                return new Player(60, 35, 10);
            case 1:
                return new Player(80, 5, 40);
            case 2:
                return new Player(100, 50, 20);
            default:
                return new Player(50, 10, 10);
        }
    }//end getInstance(int id)
    public static void main(String[] args){
        int num = (int)(Math.random() * 3);
        Enemy e = Enemy.getInstance(num);
        System.out.println(num);

        e.takeDamage(100);
        System.out.println(e.health);

    }

}//end class