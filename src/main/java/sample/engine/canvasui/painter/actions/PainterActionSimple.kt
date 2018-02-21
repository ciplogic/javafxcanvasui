package sample.engine.canvasui.painter.actions

import javafx.scene.canvas.GraphicsContext
import sample.engine.canvasui.painter.Painter

abstract class PainterActionSimple : PainterAction() {
    override fun paint(painter: Painter) {
        doPaint(painter._left, painter._top, painter._gc!!)
    }

    abstract fun doPaint(left: Int, top: Int, gc: GraphicsContext)
}