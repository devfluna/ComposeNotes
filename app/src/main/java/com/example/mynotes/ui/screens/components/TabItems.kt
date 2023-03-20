package com.example.mynotes.ui.screens.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.ui.graphics.vector.ImageVector

class TabItems {
    fun getTabItems() = listOf(
        TabItem("Notes", Icons.Outlined.Edit),
        TabItem("Reminders", Icons.Outlined.Notifications)
    )
}

data class TabItem(
    val title: String,
    val icon: ImageVector
)