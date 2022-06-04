package com.example.timer.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.timer.data.TimerData
import com.example.timer.ui.components.TimerSpinner
import com.example.timer.ui.components.TimerButton

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(32.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            TimerSpinner(
                spinnerData = TimerData.numbers0to23,
                timeUnit = "hours",
                onClick = {}
            )
            TimerSpinner(
                spinnerData = TimerData.numbers0to59,
                timeUnit = "min",
                onClick = {}
            )
            TimerSpinner(
                spinnerData = TimerData.numbers0to59,
                timeUnit = "sec",
                onClick = {}
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            TimerButton("1")
            TimerButton("2")
            TimerButton("3")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            TimerButton("4")
            TimerButton("5")
            TimerButton("6")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {
            TimerButton("7")
            TimerButton("8")
            TimerButton("9")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            TimerButton("0")
        }

        Image(
            imageVector = Icons.Default.PlayCircle,
            contentDescription = "Play circle",
            modifier = Modifier.padding(vertical = 32.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}