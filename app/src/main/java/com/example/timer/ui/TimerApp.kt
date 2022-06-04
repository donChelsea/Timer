package com.example.timer.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.timer.R
import com.example.timer.ui.theme.TimerTheme

@Composable
fun TimerApp() {
    TimerTheme {
        Scaffold(
            topBar = {
                MainAppBar()
            }
        ) { innerPadding ->

        }
    }
}

@Composable
fun MainAppBar(
    modifier: Modifier = Modifier,
) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.label_timer),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        },
        backgroundColor = MaterialTheme.colors.background,
        modifier = modifier,
        elevation = 0.dp
    )
}