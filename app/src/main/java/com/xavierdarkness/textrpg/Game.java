package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public class Game {
    //determine who goes first
    private static int rand = (int)(Math.random() * 2);
    //determine enemy
    private static int num = (int)(Math.random() * 3);
    public static void main(String[] args){
        Enemy e = Enemy.getInstance(num);
        Player p = new Player(100, 60, 30);
        Character first;
        Character second;

        if(rand == 0){
            first = p;
            second = e;
        }
        else {
            first = e;
            second = p;
        };
        while((!e.isDead()) && (!p.isDead())){
            first.attack(second);
            if((!e.isDead()) && (!p.isDead())){
                second.attack(first);
            }
            if(e.isDead()){
                System.out.println("Player wins!");
            }
            if(p.isDead()){
                System.out.println("Enemy wins!");
            }
            System.out.println("Enemy: " + num);
            System.out.println("Enemy Health: " +e.health);
            System.out.println("Player Health: " + p.health);
        }
    }
}