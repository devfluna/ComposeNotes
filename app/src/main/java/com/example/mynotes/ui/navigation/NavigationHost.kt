package com.example.mynotes.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mynotes.ui.screens.MainScreen

@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(Screen.MainScreen.route) {  MainScreen() }
    }
}