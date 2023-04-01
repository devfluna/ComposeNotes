package com.example.mynotes.ui.screens.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mynotes.ui.theme.MyNotesTheme
import com.example.mynotes.ui.viewmodel.MainViewModel

@Composable
fun AddNewNoteDialog() {

    val viewModel: MainViewModel = hiltViewModel()
    val dialogOpen by viewModel.dialogState.collectAsState()

    NewNoteDialog(shouldShow = dialogOpen) {
        viewModel.setDialogState(false)
    }
}

@Composable
fun NewNoteDialog(shouldShow: Boolean, onDismiss: () -> Unit) {

    if (shouldShow) {
        Dialog(onDismissRequest = onDismiss) {
            Surface(
                elevation = 4.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    var text by remember { mutableStateOf("") }
                    var content by remember { mutableStateOf("") }

                    TextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = text,
                        onValueChange = { text = it },
                        label = { Text(text = "Title") }
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    TextField(
                        modifier = Modifier.fillMaxWidth(),
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

                        Button(onClick = onDismiss) {
                            Text(text = "OK")
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun NewNoteDialogPreview() {
    MyNotesTheme {
        NewNoteDialog(shouldShow = true) { }
    }
}

@Preview(name = "Dark Mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun NewNoteDialogPreviewDark() {
    MyNotesTheme {
        NewNoteDialog(shouldShow = true) { }
    }
}