package com.game;

class Main extends Sprite { 
    void move(char c) {
        previous();
        if(c=='w') --x;
        else if(c=='a') --y;
        else if(c=='d') ++y;
        else if(c=='s') ++x;
        Game.invalidMove(this);
    }
}