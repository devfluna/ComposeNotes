package com.example.mynotes.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.mynotes.ui.screens.components.SwipeTabLayout
import com.example.mynotes.ui.viewmodel.MyViewModel

@Composable
fun MainScreen(viewModel: MyViewModel = hiltViewModel()) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Scaffold(
            floatingActionButton = {
                FloatingAddButton(onAddButtonTap = { viewModel.onAddButtonClicked() })
            }
        ) {
            SwipeTabLayout()
        }
    }
}