package com.example.mynotes.ui.navigation

sealed class Screen(val route: String) {
    object MainScreen: Screen("MAIN_SCREEN")
    object AddNoteScreen: Screen("ADD_NOTE_SCREEN")
}
