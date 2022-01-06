package com.game.zelda;

import com.game.zelda.render.ImageLoader;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class GameController{
    @FXML
    public Canvas gameCanvas;
    public GraphicsContext ctx;
    public ImageLoader imageLoader;

    public void initialize()
    {
         ctx = gameCanvas.getGraphicsContext2D();
         imageLoader = new ImageLoader();

    }

}