package com.horbal.carv.problem1

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Problem1Screen(modifier: Modifier = Modifier) {
    Scaffold(modifier = modifier) { innerPadding ->
        CirclesView(
            circles = predefinedCircles,
            circleColor = Color.Blue,
            modifier = Modifier.padding(innerPadding)
        )
    }
}