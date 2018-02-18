/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.engine.painter;

import javafx.scene.canvas.Canvas;

/**
 * @author cipri
 */
public class CanvasPainter {
    public Canvas canvas;

    public CanvasPainter(int width, int height) {
        canvas = new Canvas(width, height);
    }

}
