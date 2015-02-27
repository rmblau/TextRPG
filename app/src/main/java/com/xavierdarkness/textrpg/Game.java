package com.xavierdarkness.textrpg;

/**
 * Created by Xavierdarkness on 2/27/15.
 */
public class Game {

    //Fields
    private Enemy e;

    //Constructor

    Player p = new Player(100, 50, 20);

    /////////////////////////////////////////
    //HELPER METHODS////////////////////////
    ///////////////////////////////////////
    private Enemy getRandomEnemy(){
        int n = (int)(Math.random() * 2);
        return Enemy.getInstance(n);
    }

    private boolean didPlayerWin(){
        if(e.isDead()){
            return true;
        }
        return false;
    }

    private void printBattleLog(){
        System.out.println("Enemy Health: " +e.health);
        System.out.println("Player Health: " + p.health);

        if(didPlayerWin()){
            System.out.println("Player is victorious! Onto the next level!");
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
        }else{
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