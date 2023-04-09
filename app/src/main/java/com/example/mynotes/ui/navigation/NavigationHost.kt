package com.example.mynotes.ui.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynotes.ui.screens.MainScreen
import com.example.mynotes.ui.screens.NewNoteScreen
import com.example.mynotes.ui.viewmodel.MainViewModel

@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {

        composable(Screen.MainScreen.route) {
            val mainViewModel: MainViewModel = hiltViewModel()
            MainScreen(
                currentTab = mainViewModel.selectedTab,
                navigateToRoute = { route ->
                    navController.navigate(route) {
                        popUpTo(Screen.MainScreen.route)
                    }
                },
                onTabSwipeOrTap = mainViewModel::setScreenFromPagerState
            )
        }

        composable(Screen.AddNoteScreen.route) {
            NewNoteScreen(
                onBackPressed = { route ->
                    navController.navigate(route) {
                        popUpTo(Screen.MainScreen.route) { inclusive = true }
                    }
                },
                onSave = { }
            )
        }
    }
}