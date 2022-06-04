package com.example.timer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.timer.ui.TimerApp
import com.example.timer.ui.theme.TimerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimerApp()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    TimerTheme {
        TimerApp()
    }
}

