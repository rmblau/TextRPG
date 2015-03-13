package com.xavierdarkness.textrpg;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public class Game {
    TextView inventory;
    //Fields
    private Enemy e;
    //private Player p
    private TextView enemyHealth;

    //Constructor

    Player p = new Player("You",100, 50, 20);
    /////////////////////////////////////////
    //HELPER METHODS////////////////////////
    ///////////////////////////////////////
    private Enemy getRandomEnemy(){
        int n = (int)(Math.random() * 3);
        return Enemy.getInstance(n);
    }

    protected boolean didPlayerWin(){
        if(e.isDead()){
            return true;
        }
        return false;
    }

    private void printBattleLog(){
        ("Enemy Health: " + e.health);
        System.out.println("Player Health: " + p.health);
        if(didPlayerWin()){

        }
        else {
            System.out.println("The hero has fallen! GAME OVER!!!/n/n");
        }
    }

    private void assignOrder(Character[] c){
        if(c.length != 2){
            return;
        }

        int n = (int)(Math.random()*2);
        if(n == 0){
            c[0] = p;
            c[1] = e;
        }
        else {
            c[0] = e;
            c[1] = p;
        }

    }

    private void fight(Character first, Character second){
        while((!first.isDead()) && (!second.isDead())){
            first.attack(second);
            if((!first.isDead()) && (!second.isDead())){
                second.attack(first);
            }
        }
    }


    public void battle(){

        while(!p.isDead()){
            p.heal();
            //generates new enemy
            e = getRandomEnemy();
            Character[] c = new Character[2];
            assignOrder(c);
            fight(c[0], c[1]);
            printBattleLog();
        }

    }
    public static void main(String[] args){
        Game g = new Game();
        g.battle();
    }



}