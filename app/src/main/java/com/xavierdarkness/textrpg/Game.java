package com.xavierdarkness.textrpg;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

public class Game {
    TextView inventory;
    //Fields
    private Enemy e;
    protected static String deadText;
    protected static String aliveText;
    protected static String eHealth;
    protected static String eLevel;
    protected static String eStrength;
    protected static String pHealth;
    protected static int matchCounter = 0;
    private TextView enemyHealth;

    //Constructor

    Player p = new Player("Player",100, 50, 20);
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
        eHealth = ("Enemy Health: " +e.health);
        System.out.println(eHealth);
        eLevel = ("Enemy's level: " +e.level);
        System.out.println(eLevel);
        eStrength = ("Enemy's Strength: " +e.strength);
        System.out.println(eStrength);
        pHealth = ("Player Health: " + p.health);
        System.out.println(pHealth);
        if(didPlayerWin()){
            eHealth = ("Enemy Health: " +e.health);
            System.out.println(eHealth);
            eLevel = ("Enemy's level: " +e.level);
            System.out.println(eLevel);
            eStrength = ("Enemy's Strength: " +e.strength);
            System.out.println(eStrength);
            pHealth = ("Player Health: " + p.health);
            System.out.println(pHealth);
            System.out.println("The hero has won, play again?");
            aliveText = "The hero has won!, play again?";

        }
        else {
            System.out.println("The hero has fallen! GAME OVER!!!/n/n");
            deadText = "The hero has fallen";
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
                p.level++;
                e.level++;
                matchCounter++;
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
//    public static void main(String[] args){
//        Game g = new Game();
//        g.battle();
//    }



}