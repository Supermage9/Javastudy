package com.game;

abstract class Sprite {
    int x=3; int y=3;
    int oldx, oldy;
    void previous() {
        oldx = x;
        oldy = y;
    }
    abstract void move(char c);
}
