package com.example.mynotes.ui.screens.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynotes.ui.navigation.Screen
import com.example.mynotes.ui.theme.MyNotesTheme

@Composable
fun BackNavigationAndTitle(
    headTitle: String,
    onBackPressed: (String) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {

        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            modifier = Modifier.clickable { onBackPressed(Screen.MainScreen.route) })

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = headTitle,
            fontSize = MaterialTheme.typography.h3.fontSize,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
fun BackNavigationAndTitlePreview() {
    MyNotesTheme {
        BackNavigationAndTitle(headTitle = "Header Title") { }
    }
}