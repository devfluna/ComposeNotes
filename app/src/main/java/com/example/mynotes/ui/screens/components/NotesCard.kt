package com.example.mynotes.ui.screens.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynotes.ui.theme.MyNotesTheme

@Composable
fun NotesCard() {

    var visibility by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
            .padding(top = 8.dp)
            .clickable { visibility = !visibility },
        elevation = 2.dp
    ) {
        Column(modifier = Modifier.padding(horizontal = 8.dp)) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Note Title",
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.body1.fontSize
                )

                Icon(
                    imageVector = if (visibility) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown,
                    contentDescription = null,
                )
            }

            AnimatedVisibility(visible = visibility) {
                Column(Modifier.padding(vertical = 8.dp)) {
                    Text(text = "Content inside the note.")
                    Divider(Modifier.padding(vertical = 8.dp))

                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "EDIT", color = MaterialTheme.colors.primary)
                        Spacer(modifier = Modifier.width(16.dp))
                        Text(text = "DELETE", color = MaterialTheme.colors.error)
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun NotesCardPreview() {
    MyNotesTheme {
        NotesCard()
    }
}

@Preview(name = "Dark Mode", uiMode = UI_MODE_NIGHT_YES)
@Composable
fun NotesCardPreviewDark() {
    MyNotesTheme {
        NotesCard()
    }
}