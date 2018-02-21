package sample.engine.canvasui.painter.actions

import sample.engine.canvasui.painter.Painter

abstract class PainterAction {
    abstract fun paint(painter: Painter)
}