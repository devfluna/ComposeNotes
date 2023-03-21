package com.example.mynotes.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mynotes.ui.screens.components.AddNewNoteDialog
import com.example.mynotes.ui.viewmodel.MainViewModel

@Composable
fun NotesScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var message by remember { mutableStateOf("HELLO") }

        Text(text = message)

        val viewModel: MainViewModel = hiltViewModel()
        Button(onClick = { viewModel.setDialogState(true) }) {
            Text(text = "CLICK ME")
        }

        AddNewNoteDialog()
    }
}