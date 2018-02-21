package sample.engine.canvasui.painter.actions;

import javafx.scene.canvas.GraphicsContext;
import sample.engine.canvasui.painter.PainterActionSimple;

public class FillRectAction
        extends PainterActionSimple {
    private int left;
    private int top;
    private int width;
    private int height;

    public FillRectAction(int left, int top, int width, int height) {
        super();
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    @Override
    public void doPaint(int left, int top, GraphicsContext gc) {
        gc.fillRect(left + this.left, top + this.top, width, height);

    }
}
