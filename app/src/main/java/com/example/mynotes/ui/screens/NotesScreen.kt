package com.example.mynotes.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun NotesScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var message by remember { mutableStateOf("HELLO") }

        Text(text = message)

        Button(onClick = { message = "My number is now" }) {
            Text(text = "CLICK ME")
        }
    }
}