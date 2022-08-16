package com.sample.customview.component

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContextCompat

class CircleView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context) {

    var paint: Paint = Paint()
    var centerOfX = 340F
    var centerOfY = 340F
    var radiusOfCircleView = 140F

    init {
        paint.apply {
            color = ContextCompat.getColor(context, android.R.color.holo_green_light)
            strokeWidth = 40f
            style = Paint.Style.STROKE
        }
    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawCircle(centerOfX, centerOfY, radiusOfCircleView, paint)
        super.onDraw(canvas)
    }
}