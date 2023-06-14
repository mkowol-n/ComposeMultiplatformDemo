package com.example.common

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.common.demo.AppViewModel

@Composable
internal fun App(viewModel: AppViewModel = AppViewModel()) {
    val state by viewModel.state.collectAsState()
    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(state.toString())
            Spacer(Modifier.size(16.dp))
            Button(onClick = viewModel::random) {
                Text("Kliknij mnie")
            }
            Spacer(Modifier.size(16.dp))
            Button(onClick = viewModel::randomAsync) {
                Text("Kliknij mnie asynchronicznie")
            }
        }
    }
}