package com.example.mynotes.ui.screens

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FloatingAddButton(onAddButtonTap: () -> Unit) {
    FloatingActionButton(onClick = onAddButtonTap, shape = RoundedCornerShape(16.dp)) {
        Icon(
            imageVector = Icons.Rounded.Add,
            contentDescription = null,
            tint = Color.White
        )
    }
}