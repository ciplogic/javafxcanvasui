package sample.engine.canvasui.painter;

import javafx.scene.canvas.GraphicsContext;

public abstract class PainterActionSimple
        extends PainterAction {
    @Override
    public void paint(Painter painter) {
        doPaint(painter._left, painter._top, painter._gc);
    }
    public abstract void doPaint(int left, int top, GraphicsContext gc);
}
