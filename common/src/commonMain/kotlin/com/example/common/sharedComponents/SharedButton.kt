package com.example.common.sharedComponents

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
public expect fun SharedButton(text: String, color: Color, onClick: () -> Unit)