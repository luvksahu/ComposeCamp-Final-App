package com.gdsciist.composecamp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gdsciist.composecamp.ui.screens.chats.ChatScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.ContactScreen.route) {
        composable(route = Screen.ContactScreen.route) {
            ChatScreen()
        }
    }
}