package com.game.zelda.utils;

public class Position {
    public final double x,y;

    public Position(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public Position(Position other)
    {
        this.x = other.x;
        this.y = other.y;
    }

}
