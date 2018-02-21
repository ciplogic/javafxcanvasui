package sample.engine.canvasui.painter.actions;

import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import sample.engine.canvasui.painter.Painter;
import sample.engine.canvasui.painter.PainterAction;

public class FillLinearGradient extends PainterAction {
    private final Color color1;
    private final Color color2;

    public FillLinearGradient(Color color1, Color color2) {
        super();
        this.color1 = color1;
        this.color2 = color2;
    }

    private static LinearGradient drawVerticalLinearGradient(Color firstColor, Color secondColor) {
        return new LinearGradient(0, 0, 0, 1, true,
                CycleMethod.REFLECT,
                new Stop(0.0, firstColor),
                new Stop(1.0, secondColor));
    }

    @Override
    public void paint(Painter painter) {
        painter._gc.setFill(drawVerticalLinearGradient(color1, color2));
    }
}
