package com.game.zelda.entities;

import com.game.zelda.render.Camera;
import com.game.zelda.render.Sprite;
import com.game.zelda.utils.Position;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class AbstractMapElement {
    private Sprite sprite;
    private Position position;

    public AbstractMapElement(Sprite sprite)
    {
        this.sprite = sprite;
    }

    public Position getPosition() {
        return new Position(position);
    }
    public Sprite getSprite(){
        return sprite;
    }
}
