package com.example.timer.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TimerButton(
    number: String,
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier.padding(8.dp),
        contentAlignment = Alignment.Center
    ) {
        Column() {
            Text(
                text = number
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTimerButton() {
    TimerButton("1")
}