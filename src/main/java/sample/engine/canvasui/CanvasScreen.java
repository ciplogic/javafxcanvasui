package sample.engine.canvasui;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import sample.engine.canvasui.controls.Control;

import java.util.ArrayList;
import java.util.List;

public class CanvasScreen {
    Canvas _canvas;
    AnimationTimer animationTimer;
    private List<Control> _children = new ArrayList<>();

    public CanvasScreen(int w, int h) {
        _canvas = new Canvas(w, h);
        animationTimer =
                new AnimationTimer() {
                    @Override
                    public void handle(long now) {
                        paint();
                    }
                }
        ;
        animationTimer.start();
    }

    public List<Control> getChildren() {
        return _children;
    }

    public Canvas getCanvas() {
        return _canvas;
    }

    public void onMouseEvent(MouseEvent event) {

    }

    public synchronized void paint() {
        GraphicsContext gc = _canvas.getGraphicsContext2D();

        for (Control widget : _children) {
            widget.paint(gc);
            widget.onPaint();
        }
    }
}
