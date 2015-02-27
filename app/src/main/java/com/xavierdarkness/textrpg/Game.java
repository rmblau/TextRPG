package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public class Game {
    public static void main(String[] args){
        int num = (int)(Math.random() * 3);
        Enemy e = Enemy.getInstance(num);
        Player p = new Player(100, 60, 30);
        System.out.println(num);

        p.attack(e);
        System.out.println(e.health);

    }
}