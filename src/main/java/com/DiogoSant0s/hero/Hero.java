package com.DiogoSant0s.hero;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Hero {
    Position position;
    public Hero(int x, int y) {this.position = new Position(x, y);}

    public Position moveUp() {
        return new Position(position.get_x(), position.get_y() - 1);
    }
    public Position moveDown() {
        return new Position(position.get_x(), position.get_y() + 1);
    }
    public Position moveLeft() {
        return new Position(position.get_x() - 1, position.get_y());
    }
    public Position moveRight() {
        return new Position(position.get_x() + 1, position.get_y());
    }
    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.get_x(), position.get_y()), "X");
    }

    public void SetPosition(Position position) {this.position = position;}
}