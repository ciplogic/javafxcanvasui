package sample.engine.canvasui.painter;

public class FillRectAction extends PainterAction {
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
    public void paint(Painter painter) {
        painter._gc.fillRect(painter._left + left, painter._top + top, width, height);
    }
}
