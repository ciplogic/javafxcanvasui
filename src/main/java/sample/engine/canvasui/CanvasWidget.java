package sample.engine.canvasui;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import sample.engine.canvasui.painter.Painter;
import sample.engine.images.Rect;

public class CanvasWidget {
    public Color background = Color.ALICEBLUE;
    Rect _position = new Rect(0, 0, 1, 1);

    private LinearGradient drawLinearGradient(Color firstColor, Color secondColor) {
        return new LinearGradient(0, 0, 1, 1, true,
                CycleMethod.REFLECT,
                new Stop(0.0, firstColor),
                new Stop(1.0, secondColor));
    }

    public final void paint(Painter gc) {
        gc.setFill(background);

        LinearGradient lg = drawLinearGradient(Color.RED, Color.YELLOW);
        gc.setFill(lg);

        gc.fillRect(_position.getLeft(), _position.getTop(), _position.getWidth(), _position.getHeight());

    }

    public void onPaint() {

    }

    public void setWidth(int width) {
        _position.setWidth(width);
    }

    public void setHeight(int height) {
        _position.setHeight(height);
    }

    public void setPos(int left, int top) {
        _position.setLeft(left);
        _position.setTop(top);
    }
}
