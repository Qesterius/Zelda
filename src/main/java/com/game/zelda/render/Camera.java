package com.game.zelda.render;

import com.game.zelda.utils.Position;

public class Camera {
    private Position position;


    public Camera(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return new Position(position);
    }
}
