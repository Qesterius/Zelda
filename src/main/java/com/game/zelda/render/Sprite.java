package com.game.zelda.render;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.io.FileNotFoundException;

public class Sprite {
    private final Image image;

    //TODO: add custom sprite handling ex. for animations
    public Sprite(String source, ImageLoader imageLoader) throws FileNotFoundException {
        image = imageLoader.getImage(source);
    }

    public Image getImage() {
        return image;
    }
}
