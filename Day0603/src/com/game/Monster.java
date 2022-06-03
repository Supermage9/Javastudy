package com.game;

class Monster extends Sprite {
    public Monster() {
        x = y = (int)Math.random()*8+1;
    }
    void move(char c) {
        previous();
        double d = Math.random();
        x += (d-0.25)>0? 1: -1;
        y +=(d-0.75)>0? 1:-1;
        Game.invalidMove(this);
    }
}