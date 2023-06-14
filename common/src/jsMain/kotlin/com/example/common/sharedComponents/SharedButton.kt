package com.example.common.sharedComponents

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
public actual fun SharedButton(text: String, color: Color, onClick: () -> Unit) {
//    Button(
//        attrs = {
//            this.style {
//                this.background(color.toString())
//            }
//        }
//    ) {
//        SharedText(text = text)
//    }
    androidx.compose.material3.Button(
        colors = ButtonDefaults.buttonColors(
            color
        ),
        onClick = onClick
    ) {
        SharedText(text = text)
    }
}