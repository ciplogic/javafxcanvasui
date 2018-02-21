package sample.engine.canvasui.painter

import javafx.geometry.VPos
import javafx.scene.canvas.GraphicsContext
import javafx.scene.paint.*
import javafx.scene.text.TextAlignment
import sample.engine.canvasui.painter.actions.*
import sample.engine.images.Rect
import java.util.ArrayList

class Painter {
    var _top: Int = 0
    var _left: Int = 0
    var _gc: GraphicsContext? = null

    fun setGc(gc: GraphicsContext) {
        this._gc = gc
    }

    fun fillRect(rect: Rect) {

        fillRect(_left+rect.left, _top+rect.top, rect.width, rect.height)
    }

    fun fillRect(left: Int, top: Int, width: Int, height: Int) {
        _gc!!.fillRect(_left+left.toDouble(), _top+ top.toDouble(), width.toDouble(), height.toDouble())
    }

    fun setFillLinearGradient(color1: Color, color2: Color) {
        _gc!!.fill = drawVerticalLinearGradient(color1, color2)
    }

    fun setDrawText(x: Int, y: Int, text: String) {
        _gc!!.fillText(text, (_left + x).toDouble(), (_top + y).toDouble())
    }

    fun setFill(background: Paint) {
        _gc!!.fill = background
    }


    fun setTextAlign(align: TextAlignment) {
        _gc!!.textAlign = align
        _gc!!.textBaseline = VPos.CENTER

    }

    fun setPos(left: Int, top: Int) {
        this._left = left
        this._top = top
    }


    private fun drawVerticalLinearGradient(firstColor: Color, secondColor: Color): LinearGradient {
        return LinearGradient(0.0, 0.0, 0.0, 1.0, true,
                CycleMethod.REFLECT,
                Stop(0.0, firstColor),
                Stop(1.0, secondColor))
    }
}