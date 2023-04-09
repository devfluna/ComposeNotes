package com.example.mynotes.ui.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynotes.ui.screens.components.NotesCard
import com.example.mynotes.ui.theme.MyNotesTheme

@Composable
fun NotesScreen() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.surface)
    ) {

        LazyColumn(contentPadding = PaddingValues(vertical = 16.dp)) {
            items(12) { index ->
                NotesCard()
            }
        }
    }
}

@Preview
@Composable
fun NotesScreenPreview() {
    MyNotesTheme {
        NotesScreen()
    }
}

@Preview(name = "Dark Mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun NotesScreenPreviewDark() {
    MyNotesTheme {
        NotesScreen()
    }
}