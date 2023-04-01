package com.example.mynotes.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mynotes.ui.screens.components.AddNewNoteDialog
import com.example.mynotes.ui.screens.components.NotesCard

@Composable
fun NotesScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.surface)
    ) {
        
        LazyColumn(contentPadding = PaddingValues(vertical = 16.dp)) {
            items(12){ index ->
                NotesCard()
            }
        }

        AddNewNoteDialog()
    }
}