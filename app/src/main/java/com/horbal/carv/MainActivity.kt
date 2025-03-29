package com.horbal.carv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.horbal.carv.problem1.Problem1Screen
import com.horbal.carv.problem3.Problem3Screen
import com.horbal.carv.ui.theme.CarvTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarvTheme {
                // Problem1Screen(modifier = Modifier.fillMaxSize())
                Problem3Screen(modifier = Modifier.fillMaxSize())
            }
        }
    }
}