package com.example.timer.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TimerSpinner(
    modifier: Modifier = Modifier,
    spinnerData: List<String>,
    timeUnit: String,
    onClick: (String) -> Unit,
) {

    val selectedItem = remember { mutableStateOf(spinnerData[0]) }
    val expanded = remember { mutableStateOf(false) }

    Box(
        modifier = modifier.wrapContentWidth(),
        contentAlignment = Alignment.Center,
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp)
                .clickable {
                    expanded.value = !expanded.value
                },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "${selectedItem.value} $timeUnit",
                fontSize = 18.sp,
                modifier = Modifier.padding(end = 8.dp)
            )
            Icon(
                imageVector = Icons.Filled.ArrowDropDown,
                contentDescription = "Drop down arrow"
            )

            DropdownMenu(
                expanded = expanded.value,
                onDismissRequest = { expanded.value = false }
            ) {
                spinnerData.forEach { item ->
                    DropdownMenuItem(onClick = {
                        expanded.value = false
                        selectedItem.value = item
                        onClick(selectedItem.value)
                    }) {
                        Text(text = item)
                    }
                }

            }
        }
    }
}