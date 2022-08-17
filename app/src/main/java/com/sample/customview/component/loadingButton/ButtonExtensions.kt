package com.sample.customview.component.loadingButton

import android.graphics.drawable.GradientDrawable
import androidx.appcompat.widget.AppCompatButton

// created by https://github.com/jeanjnap/LoadingButton
fun AppCompatButton.setBackgroundColorWithCorner(color: Int, cornerRadius: Int) {
    background = GradientDrawable().apply {
        shape = GradientDrawable.RECTANGLE
        this.cornerRadius = cornerRadius.toFloat()
        setColor(color)
    }
}
