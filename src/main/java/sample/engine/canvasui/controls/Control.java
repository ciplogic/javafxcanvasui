package sample.engine.canvasui.controls;

import javafx.scene.canvas.GraphicsContext;
import sample.engine.canvasui.painter.Painter;
import sample.engine.images.Rect;

public abstract class Control {
    protected Rect _position = new Rect(0, 0, 1, 1);
    protected Painter painter = new Painter();

    public final void paint(GraphicsContext gc) {
        painter.setGc(gc);
        painter.setPos(_position.getLeft(), _position.getTop());
    }

    public abstract void onPaint();

}
