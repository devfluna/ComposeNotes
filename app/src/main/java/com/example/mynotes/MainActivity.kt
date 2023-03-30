package com.example.mynotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mynotes.ui.navigation.NavigationHost
import com.example.mynotes.ui.theme.MyNotesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNotesTheme {
                NavigationHost()
            }
        }
    }
}