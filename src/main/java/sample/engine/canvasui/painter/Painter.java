package sample.engine.canvasui.painter;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.TextAlignment;
import sample.engine.canvasui.painter.actions.*;
import sample.engine.images.Rect;

import java.util.ArrayList;
import java.util.List;

public class Painter {
    public int _top, _left;
    public GraphicsContext _gc;
    private List<PainterAction> _actions = new ArrayList<>();

    public Painter() {
    }
    public void clear() {
        _actions.clear();
    }


    private void addAction(PainterAction action) {
        _actions.add(action);
    }

    public void setGc(GraphicsContext gc) {
        this._gc = gc;
    }

    public void fillRect(Rect rect) {
        fillRect(rect.getLeft(), rect.getTop(), rect.getWidth(), rect.getHeight());
    }

    public void fillRect(int left, int top, int width, int height) {
        addAction(new FillRectAction(left, top, width, height));
    }
    public void setFillLinearGradient(Color color1, Color color2) {
        addAction(new FillLinearGradient(color1, color2));
    }

    public void setDrawText(int x, int y, String text) {
        addAction(new PaintTextAction(x,y,text));
    }

    public void setFill(Paint background) {
        _gc.setFill(background);
    }

    public void runActions() {
        for (PainterAction action : _actions) {
            action.paint(this);
        }
    }

    public void setTextAlign(TextAlignment align) {
        addAction(new TextAlignAction(align));

    }

    public void setPos(int left, int top) {
        this._left = left;
        this._top = top;
    }
}
