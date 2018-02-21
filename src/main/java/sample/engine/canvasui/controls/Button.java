package sample.engine.canvasui.controls;

import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;

public class Button
        extends Control {

    public Button(int x, int y, int w, int h) {
        _position.setPos(x, y);
        _position.setSize(w, h);
    }

    @Override
    public void onPaint() {
        painter.setFillLinearGradient(Color.BLUE, Color.RED);
        painter.fillRect(0,0,_position.getWidth(), _position.getHeight());
        painter.setFillLinearGradient(Color.WHITE, Color.CORAL);
        painter.setTextAlign(TextAlignment.CENTER);
        painter.setDrawText(_position.getWidth()/2, _position.getHeight()/2, "OK");
    }
}
