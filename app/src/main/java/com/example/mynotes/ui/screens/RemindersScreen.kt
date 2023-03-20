package com.example.mynotes.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlin.random.Random

@Composable
fun RemindersScreen() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var onScreentext by remember { mutableStateOf("HELLO") }

        Text(text = onScreentext)

        Button(onClick = { onScreentext = "My NAME is now ${Random.nextInt()}" }) {
            Text(text = "CLICK ME")
        }
    }
}