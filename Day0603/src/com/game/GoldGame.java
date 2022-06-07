package com.game;


public class GoldGame {
	
    public static void main(String[] args) {
        Game obj = new Game();
        do {
            obj.init();
            obj.print();
            obj.move();
        }while(obj.c!='o' && !obj.getGold(obj.mnstr) && !obj.getGold(obj.user) && !obj.attackMonster());
        obj.endprint();
    }
}









