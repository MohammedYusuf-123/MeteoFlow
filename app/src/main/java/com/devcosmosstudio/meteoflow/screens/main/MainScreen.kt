package com.devcosmosstudio.meteoflow.screens.main

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Surface {
        Text(text = "Hello there I see you came to main screen")
    }
}