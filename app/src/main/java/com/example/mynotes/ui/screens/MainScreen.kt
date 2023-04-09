package com.example.mynotes.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.mynotes.ui.navigation.Screen
import com.example.mynotes.ui.screens.components.SwipeTabLayout
import kotlinx.coroutines.flow.StateFlow

@Composable
fun MainScreen(
    currentTab: StateFlow<Int>,
    navigateToRoute: (String) -> Unit,
    onTabSwipeOrTap: (Int) -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Scaffold(
            floatingActionButton = {
                FloatingAddButton(onAddButtonTap = {
                    if (currentTab.value == 0) navigateToRoute(Screen.AddNoteScreen.route)
                })
            }
        ) {
            SwipeTabLayout(onSwipeOrClicked = onTabSwipeOrTap)
        }
    }
}