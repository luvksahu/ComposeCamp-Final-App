package com.gdsciist.composecamp.navigation

sealed class Screen(val route: String) {
    object ContactScreen : Screen("contact_screen")
    object ChatScreen : Screen("chat_screen")
}