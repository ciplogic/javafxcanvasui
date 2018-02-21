package sample.engine.canvasui.painter.actions;

import javafx.scene.canvas.GraphicsContext;
import sample.engine.canvasui.painter.PainterActionSimple;

public class PaintTextAction extends PainterActionSimple {
    private final int x;
    private final int y;
    private final String text;

    public PaintTextAction(int x, int y, String text) {
        super();
        this.x = x;
        this.y = y;
        this.text = text;
    }

    @Override
    public void doPaint(int left, int top, GraphicsContext gc) {
        gc.fillText(text, left+x, top+y);
    }
}
