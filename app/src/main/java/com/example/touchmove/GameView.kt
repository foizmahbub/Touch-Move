package com.example.touchmove

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

class GameView (context:Context) : View(context){
    var circleX=200f
    var circleY=200f
    val circleRadious=50f
    val paint=Paint()
    init {
        paint.color=Color.BLUE
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawColor(Color.BLACK)
        canvas.drawCircle(circleX,circleY,circleRadious,paint)
        invalidate()

        }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return super.onTouchEvent(event)
        circleX=event.x
        circleY=event.y
        invalidate()
        return true

    }
    }