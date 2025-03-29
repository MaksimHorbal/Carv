package com.horbal.carv.problem3

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.horbal.carv.problem1.CirclesView
import com.horbal.carv.problem1.predefinedCircles

@Composable
fun Problem3Screen(modifier: Modifier = Modifier) {
    val isDeviceConnected by Device().isConnected().collectAsState(true)
    Scaffold(modifier = modifier) { innerPadding ->
        CirclesView(
            circles = predefinedCircles,
            circleColor = if (isDeviceConnected) Color.Blue else Color.Red,
            modifier = Modifier.padding(innerPadding)
        )
    }
}