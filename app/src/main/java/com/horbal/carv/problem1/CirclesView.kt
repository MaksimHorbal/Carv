package com.horbal.carv.problem1

import androidx.compose.foundation.Canvas
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

@Composable
fun CirclesView(
    circles: List<Circle>,
    circleColor: Color,
    modifier: Modifier = Modifier,
) {
    Canvas(modifier = modifier) {
        circles.forEach { circle ->
            drawCircle(
                color = circleColor,
                radius = circle.radius,
                center = Offset(circle.x, circle.y)
            )
        }
    }
}