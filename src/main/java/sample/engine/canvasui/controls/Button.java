package sample.engine.canvasui.controls;

import javafx.scene.paint.Color;

public class Button
        extends Control {

    public Button(int x, int y, int w, int h) {
        _position.setPos(x, y);
        _position.setSize(w, h);
    }

    @Override
    public void onPaint() {
        painter.clear();
        painter.setFillLinearGradient(Color.BLUE, Color.RED);
        painter.fillRect(_position);
        painter.setFillLinearGradient(Color.WHITE, Color.CORAL);
        painter.setTextAlign(1);
        painter.setDrawText(_position.getLeft()+10, _position.getTop()+10, "OK");
    }
}
