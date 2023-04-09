package com.example.mynotes.ui.screens

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynotes.ui.screens.components.BackNavigationAndTitle
import com.example.mynotes.ui.theme.MyNotesTheme

@Composable
fun NewNoteScreen(onBackPressed: (String) -> Unit, onSave: () -> Unit) {
    Surface(
        elevation = 4.dp,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var text by remember { mutableStateOf("") }
            var content by remember { mutableStateOf("") }

            BackNavigationAndTitle(headTitle = "New Note") {
                onBackPressed(it)
            }

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = text,
                onValueChange = { text = it },
                label = { Text(text = "Title") }
            )

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize(0.9f),
                value = content,
                onValueChange = { content = it },
                label = { Text(text = "Note") }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Button(onClick = onSave, enabled = content.isNotEmpty()) {
                    Text(text = "SAVE")
                }
            }
        }
    }

}

@Preview
@Composable
fun NewNoteDialogPreview() {
    MyNotesTheme {
        NewNoteScreen(onBackPressed = { /*TODO*/ }) {

        }
    }
}

@Preview(name = "Dark Mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun NewNoteDialogPreviewDark() {
    MyNotesTheme {
        NewNoteScreen(onBackPressed = { /*TODO*/ }) {

        }
    }
}