package sample.engine.canvasui.painter.actions;

import javafx.geometry.VPos;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.TextAlignment;
import sample.engine.canvasui.painter.PainterActionSimple;

public class TextAlignAction extends PainterActionSimple {
    private int align;

    public TextAlignAction(int align) {
        super();
        this.align = align;
    }

    @Override
    public void doPaint(int left, int top, GraphicsContext gc) {
        gc.setTextAlign(TextAlignment.CENTER);
        gc.setTextBaseline(VPos.CENTER);
    }
}
