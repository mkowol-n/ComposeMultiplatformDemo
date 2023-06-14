package com.example.common.sharedComponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType

@OptIn(ExperimentalUnitApi::class)
@Composable
public fun SharedText(modifier: Modifier = Modifier, text: String) {
    Text(
        modifier = modifier,
        text = text, color = Color.Black, style = TextStyle(
            fontSize = TextUnit(value = 50F, type = TextUnitType.Sp)
        )
    )
}