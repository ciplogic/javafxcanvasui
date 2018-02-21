package sample.engine.canvasui.painter.actions


import javafx.geometry.VPos
import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.Color
import javafx.scene.paint.CycleMethod
import javafx.scene.paint.LinearGradient
import javafx.scene.paint.Stop
import javafx.scene.text.TextAlignment
import sample.engine.canvasui.painter.Painter


class FillLinearGradient(private val color1: Color, private val color2: Color) : PainterAction() {

    private fun drawVerticalLinearGradient(firstColor: Color, secondColor: Color): LinearGradient {
        return LinearGradient(0.0, 0.0, 0.0, 1.0, true,
                CycleMethod.REFLECT,
                Stop(0.0, firstColor),
                Stop(1.0, secondColor))
    }

    override fun paint(painter: Painter) {
        painter._gc.fill = drawVerticalLinearGradient(color1, color2)
    }
}

class FillRectAction(private val left: Int, private val top: Int, private val width: Int, private val height: Int) : PainterActionSimple() {

    override fun doPaint(left: Int, top: Int, gc: GraphicsContext) {
        gc.fillRect(left.toDouble(), top.toDouble(), width.toDouble(), height.toDouble())

    }
}

class PaintTextAction(private val x: Int, private val y: Int, private val text: String) : PainterActionSimple() {

    override fun doPaint(left: Int, top: Int, gc: GraphicsContext) {
        gc.fillText(text, (left + x).toDouble(), (top + y).toDouble())
    }
}

class TextAlignAction(private val align: TextAlignment) : PainterActionSimple() {

    override fun doPaint(left: Int, top: Int, gc: GraphicsContext) {
        gc.textAlign = align
        gc.textBaseline = VPos.CENTER
    }
}
