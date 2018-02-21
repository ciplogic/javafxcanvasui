package sample.engine.canvasui.painter.actions


import javafx.geometry.VPos
import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.*
import javafx.scene.text.TextAlignment
import sample.engine.canvasui.painter.Painter

abstract class PainterAction {
    abstract fun paint(painter: Painter)
}
